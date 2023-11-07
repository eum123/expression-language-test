package janino;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.ICompiler;
import org.codehaus.commons.compiler.ICompilerFactory;
import org.codehaus.commons.compiler.samples.CompilerDemo;
import org.codehaus.commons.compiler.util.ResourceFinderClassLoader;
import org.codehaus.commons.compiler.util.resource.MapResourceCreator;
import org.codehaus.commons.compiler.util.resource.MapResourceFinder;
import org.codehaus.commons.compiler.util.resource.Resource;
import org.codehaus.commons.compiler.util.resource.StringResource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 확인된 내용
 *  - 동적으로 class compile해서 reflection을 이용하여 객체를 생성하여 사용 가능하다.
 *  - static method 뿐만 아니라 일반 method도 가능
 *  - 하나의 method에 최대 150k 까지 가능하고 그 이상이 필요한 경우 method를 분리해서 가능하다.
 *  - method의 수는 상관없음(100까지 테스트함)
 *  - 17M 크기의  class를 compile시 상당히 오래 걸림.(종료되지 않음.)
 *  - 9M 크기의 class를 compile시 121초, 실행은 0.174초
 *  - 단순 if문 으로 크기만 생성한거라 업무 적용시 소요시간이 더 커질수 있음.
 * </pre>
 */
public class CompilerTest {
    @Test
    public void test() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                        .getDefaultCompilerFactory(CompilerTest.class.getClassLoader())
                        .newCompiler();



        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        // Now compile two units from strings:
        compiler.compile(new Resource[] {
                new StringResource(
                        "pkg1/A.java",
                        "package pkg1; public class A { public static int meth() { return pkg2.B.meth(); } }"
                ),
                new StringResource(
                        "pkg2/B.java",
                        "package pkg2; public class B { public static int meth() { return 77;            } }"
                ),
        });

        // Set up a class loader that uses the generated classes.
        ClassLoader cl = new ResourceFinderClassLoader(
                new MapResourceFinder(classes),    // resourceFinder
                ClassLoader.getSystemClassLoader() // parent
        );

        long start = System.currentTimeMillis();

        System.out.println(cl.loadClass("pkg1.A").getDeclaredMethod("meth").invoke(null));

        System.out.println(System.currentTimeMillis() - start);

        //Assert.assertEquals(77, cl.loadClass("pkg1.A").getDeclaredMethod("meth").invoke(null));
    }


    @Test
    public void test1() throws Exception {

        StopWatch stopWatch = new StopWatch("test1");
        stopWatch.start("create");

        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(CompilerTest.class.getClassLoader())
                .newCompiler();

        stopWatch.stop();
        stopWatch.start("compile");

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        StringBuilder builder = new StringBuilder();
        builder.append("package pkg2; ");
        builder.append("import java.util.HashMap; ");
        builder.append("import java.util.Map; ");
        builder.append("import java.lang.Integer; ");
        builder.append("public class RuleId {");
        builder.append("    public static Map<String, Object> meth(Map<String, Object> parameter) {");
        builder.append("        Map<String, Object> map = new HashMap();");
        builder.append("        if((Integer)parameter.get(\"홍길동\") > 0) {");
        builder.append("            map.put(\"홍길동\", \"1\");");
        builder.append("        }");
        builder.append("        return map;");
        builder.append("    }");
        builder.append("}");

        // Now compile two units from strings:
        compiler.compile(new Resource[] {

                new StringResource(
                        "pkg2/RuleId.java",
                        builder.toString()
                )
        });

        // Set up a class loader that uses the generated classes.
        ClassLoader cl = new ResourceFinderClassLoader(
                new MapResourceFinder(classes),    // resourceFinder
                ClassLoader.getSystemClassLoader() // parent
        );

        stopWatch.stop();
        stopWatch.start("execute");

        java.lang.reflect.Method[] methods = cl.loadClass("pkg2.RuleId").getMethods();
        for (Method method : methods) {

            if(method.getName().equals("meth")) {
                Map map = new HashMap();
                map.put("홍길동", 1);
                System.out.println(method.invoke("meth", map));
            }
        }


        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());

        //Assert.assertEquals(77, cl.loadClass("pkg1.A").getDeclaredMethod("meth").invoke(null));
    }

    @DisplayName("non static method")
    @Test
    public void test2() throws Exception {

        StopWatch stopWatch = new StopWatch("test1");
        stopWatch.start("create");

        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(CompilerTest.class.getClassLoader())
                .newCompiler();

        stopWatch.stop();
        stopWatch.start("compile");

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        StringBuilder builder = new StringBuilder();
        builder.append("package pkg2; ");
        builder.append("import java.util.HashMap; ");
        builder.append("import java.util.Map; ");
        builder.append("import java.lang.Integer; ");
        builder.append("public class RuleId {");


        //
        for(int i=0 ;i<50 ;i++) {
            builder.append("    public Map<String, Object> meth" + i + "(Map<String, Object> parameter) {");
            builder.append("        Map<String, Object> map = new HashMap();");

            for (int j = 0; j < 2000; j++) {
                builder.append("        if((Integer)parameter.get(\"홍길동\") > 0) {");
                builder.append("            map.put(\"홍길동\", \"1\");");
                builder.append("        }");
            }
            builder.append("        return map;");
            builder.append("    }");
        }
        //

        builder.append("    public Map<String, Object> meth(Map<String, Object> parameter) {");
        builder.append("        Map<String, Object> map = new HashMap();");

        for(int i=0 ; i<2000 ;i++) {
            builder.append("        if((Integer)parameter.get(\"홍길동\") > 0) {");
            builder.append("            map.put(\"홍길동\", \"1\");");
            builder.append("        }");
        }

        for(int i=0 ;i<50 ;i++) {
            builder.append("        meth" + i +"(parameter);");
        }
        builder.append("        return map;");
        builder.append("    }");

        builder.append("}");

        System.out.println(builder.length());

        // Now compile two units from strings:
        compiler.compile(new Resource[] {

                new StringResource(
                        "pkg2/RuleId.java",
                        builder.toString()
                )
        });

        // Set up a class loader that uses the generated classes.
        ClassLoader cl = new ResourceFinderClassLoader(
                new MapResourceFinder(classes),    // resourceFinder
                ClassLoader.getSystemClassLoader() // parent
        );

        stopWatch.stop();
        stopWatch.start("execute");

        Class c = cl.loadClass("pkg2.RuleId");
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            if(constructor.getParameterCount() == 0) {
                Object obj = constructor.newInstance();

                Method[] methods = c.getMethods();

                for (Method method : methods) {

                    if(method.getName().equals("meth")) {
                        Map map = new HashMap();
                        map.put("홍길동", 1);
                        System.out.println(method.invoke(obj, map));
                    }
                }
            }
        }



        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());

        //Assert.assertEquals(77, cl.loadClass("pkg1.A").getDeclaredMethod("meth").invoke(null));
    }
}
