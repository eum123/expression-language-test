package janino;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.ICompiler;
import org.codehaus.commons.compiler.util.resource.MapResourceCreator;
import org.codehaus.commons.compiler.util.resource.MapResourceFinder;
import org.codehaus.commons.compiler.util.resource.Resource;
import org.codehaus.commons.compiler.util.resource.StringResource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StopWatch;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

/**
 * compile 후 class를 저장하여 로딩하는 방식
 * <pre>
 * 1. 디자이너에서 compile한다
 * 2. class 파일을 배포한다.
 * 3. class를 load 한다
 * 4. instance를 생성하여 사용한다.
 * </pre>
 */
public class CompileAndLoadTest {
    @Test
    public void writeClass() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(CompileAndLoadTest.class.getClassLoader())
                .newCompiler();

        compiler.setVerbose(true);

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();

        MapResourceCreator mapResourceCreator = new MapResourceCreator(classes);

        compiler.setClassFileCreator(mapResourceCreator);

        MapResourceFinder mapResourceFinder = new MapResourceFinder(classes);

        List<Resource> resources = new ArrayList();
        resources.add(new StringResource(
                "pkg1/A.java",
                "package pkg1; public class A { public static int meth() { return 2; } }"
        ));


        // Now compile two units from strings:
        compiler.compile(resources.toArray(new Resource[resources.size()]));

        System.out.println(classes);

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class"));
        out.write(classes.get("pkg1/A.class"));
        out.flush();

        out.close();
    }

    @Test
    public void load() throws Exception  {
        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class", "pkg1.A");

        System.out.println(a);
        Object result = a.getDeclaredMethod("meth").invoke(null);
        System.out.println(result);
    }

    @Test
    public void writeClass1() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(CompileAndLoadTest.class.getClassLoader())
                .newCompiler();

        compiler.setVerbose(true);

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();

        MapResourceCreator mapResourceCreator = new MapResourceCreator(classes);

        compiler.setClassFileCreator(mapResourceCreator);

        MapResourceFinder mapResourceFinder = new MapResourceFinder(classes);

        List<Resource> resources = new ArrayList();
        resources.add(new StringResource(
                "pkg1/A.java",
                "package pkg1; public class A { public static int meth() { return 3; } }"
        ));


        // Now compile two units from strings:
        compiler.compile(resources.toArray(new Resource[resources.size()]));

        System.out.println(classes);

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class"));
        out.write(classes.get("pkg1/A.class"));
        out.flush();

        out.close();
    }

    @Test
    public void all() throws Exception {
        writeClass();
        load();
        writeClass1();
        load();
    }

    /**
     * java 파일의 크기제약으로 class로 분리해야됨.
     * @throws Exception
     */
    @Test
    public void big() throws Exception {
        //file size : 3,072,030

        StopWatch stopWatch = new StopWatch("big");
        stopWatch.start("create");

        //file size : 3,072,030 compile 에러
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(Thread.currentThread().getContextClassLoader())
                .newCompiler();
        /**
         * ---------------------------------------------
         * ns         %     Task name
         * ---------------------------------------------
         * 118765875  003%  create
         * 4352390291  097%  compile
         * 000590458  000%  file write
         * 002992291  000%  class load
         * 012586541  000%  execute
         */


        //file size : 3,072,030 - 성공
        //JDK compiler 4047529584
        compiler = CompilerFactoryFactory.getCompilerFactory("org.codehaus.commons.compiler.jdk.CompilerFactory", Thread.currentThread().getContextClassLoader()).newCompiler();
        /**
         * ---------------------------------------------
         * ns         %     Task name
         * ---------------------------------------------
         * 149489125  002%  create
         * 9137839667  098%  compile
         * 000709041  000%  file write
         * 003463292  000%  class load
         * 046555208  000%  execute
         */



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
        for(int i=0 ;i<1500 ;i++) {
            builder.append("    public Map<String, Object> meth" + i + "(Map<String, Object> parameter) {");
            builder.append("        Map<String, Object> map = new HashMap();");

            for (int j = 0; j < 20; j++) {
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

        for(int i=0 ;i<1500 ;i++) {
            builder.append("        meth" + i +"(parameter);");
        }
        builder.append("        return map;");
        builder.append("    }");

        builder.append("}");

        System.out.println("java length : " + builder.length());

        // Now compile two units from strings:
        compiler.compile(new Resource[] {

                new StringResource(
                        "pkg2/RuleId.java",
                        builder.toString()
                )
        });

        stopWatch.stop();
        stopWatch.start("file write");

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/RuleId.class"));
        out.write(classes.get("pkg2/RuleId.class"));
        out.flush();
        out.close();

        stopWatch.stop();
        stopWatch.start("class load");

        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/RuleId.class", "pkg2.RuleId");


        stopWatch.stop();
        stopWatch.start("execute");

        Object obj = a.newInstance();

        System.out.println("object : " + obj);

        Map map = new HashMap();
        map.put("홍길동", 1);
        Object result = a.getMethod("meth", Map.class).invoke(obj, map);
        System.out.println("result :" + result);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }


    /**
     * custom class를 사용하려면 Thread.currentThread().getContextClassLoader()를 사용해야 한다.
     * @throws Exception
     */
    @Test
    public void loadCustomClass() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(Thread.currentThread().getContextClassLoader())
                .newCompiler();

        compiler.setVerbose(true);

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();

        MapResourceCreator mapResourceCreator = new MapResourceCreator(classes);

        compiler.setClassFileCreator(mapResourceCreator);

        MapResourceFinder mapResourceFinder = new MapResourceFinder(classes);

        List<Resource> resources = new ArrayList();
        resources.add(new StringResource(
                "pkg1/A.java",
                "package pkg1; import com.example.mvel.MvelApplication; public class A { public static int meth() { return 2; } }"
        ));


        // Now compile two units from strings:
        compiler.compile(resources.toArray(new Resource[resources.size()]));

        System.out.println(classes);

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class"));
        out.write(classes.get("pkg1/A.class"));
        out.flush();

        out.close();
    }
}
