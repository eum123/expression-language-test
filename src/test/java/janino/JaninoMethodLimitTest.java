package janino;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.ICompiler;
import org.codehaus.commons.compiler.util.resource.MapResourceCreator;
import org.codehaus.commons.compiler.util.resource.Resource;
import org.codehaus.commons.compiler.util.resource.StringResource;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class JaninoMethodLimitTest {
    /**
     * java 파일의 크기제약으로 class로 분리해야됨.
     * @throws Exception
     */
    @Test
    public void big() throws Exception {

        StopWatch stopWatch = new StopWatch("big");
        stopWatch.start("create");

        ICompiler compiler = CompilerFactoryFactory.getCompilerFactory("org.codehaus.commons.compiler.jdk.CompilerFactory", Thread.currentThread().getContextClassLoader()).newCompiler();

        /**
         * Method하나에 최대 65536 bytes 까지 코드를 입력할수 있다.
         * file size : 120,872,638
         * ---------------------------------------------
         * ns         %     Task name
         * ---------------------------------------------
         * 089084083  000%  create
         * 324513322875  099%  compile
         * 040549875  000%  file write
         * 193163958  000%  class load
         * 1790261667  001%  execute
         */



        stopWatch.stop();
        stopWatch.start("compile");

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        StringBuilder builder = new StringBuilder();
        builder.append("package pkg2; ").append("\r\n");
        builder.append("import java.util.HashMap; ").append("\r\n");
        builder.append("import java.util.Map; ").append("\r\n");
        builder.append("import java.util.List; ").append("\r\n");
        builder.append("import java.lang.Integer; ").append("\r\n");
        builder.append("import org.apache.commons.collections4.properties.SortedProperties; ").append("\r\n");


        builder.append("public class C {").append("\r\n");

        //
        for(int i=0 ;i<10000 ;i++) {
            builder.append("    public Map<String, Object> meth" + i + "(Map<String, Object> parameter) {").append("\r\n");
            builder.append("        Map<String, Object> map = new HashMap();").append("\r\n");

            for(int cnt = 0 ;cnt < 5 ;cnt ++) {
                builder.append("        if( ");
                for (int j = 0; j < 50; j++) {
//                    if (j % 5 == 0) {
//                        //list
//                    } else {
                        builder.append("    (Integer)parameter.get(\"PARAM_").append(j).append("\") > 0").append(" && ");
//                    }
                }
                builder.append("            true ");
                builder.append("        ) {").append("\r\n");
                builder.append("            map.put(\"홍길동\", \"" + i + "\");").append("\r\n");
                builder.append("        }").append("\r\n");
            }

            builder.append("        return map;").append("\r\n");
            builder.append("    }").append("\r\n");
        }
        //

        builder.append("    public Map<String, Object> meth(Map<String, Object> parameter) {");

        builder.append("        SortedProperties p = new SortedProperties();");     //외부 library 사용가능 확인
        builder.append("        Map<String, Object> map = new HashMap();");


        for(int i=0 ;i<10000 ;i++) {
            builder.append("        map = meth" + i +"(parameter);").append("\r\n");
        }
        builder.append("        return map;").append("\r\n");
        builder.append("    }").append("\r\n");

        builder.append("}").append("\r\n");

        System.out.println("java length : " + builder.length());

        // Now compile two units from strings:
        compiler.compile(new Resource[] {

                new StringResource(
                        "pkg2/C.java",
                        builder.toString()
                )
        });

        stopWatch.stop();
        stopWatch.start("file write");

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/C.class"));
        out.write(classes.get("pkg2/C.class"));
        out.flush();
        out.close();

        stopWatch.stop();
        stopWatch.start("class load");

        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/C.class", "pkg2.C");


        stopWatch.stop();
        stopWatch.start("execute");

        Object obj = a.newInstance();

        System.out.println("object : " + obj);

        Map map = new HashMap();
        for(int i = 0 ;i<50 ;i++) {
            map.put("PARAM_" + i, 1);
        }
        Object result = a.getMethod("meth", Map.class).invoke(obj, map);
        System.out.println("result :" + result);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }


    @Test
    public void big1() throws Exception {

        StopWatch stopWatch = new StopWatch("big");
        stopWatch.start("create");

        ICompiler compiler = CompilerFactoryFactory.getCompilerFactory("org.codehaus.commons.compiler.jdk.CompilerFactory", Thread.currentThread().getContextClassLoader()).newCompiler();

        /**
         * file size : 12534788
         * ---------------------------------------------
         * ns         %     Task name
         * ---------------------------------------------
         * 088961834  000%  create
         * 28738863709  099%  compile
         * 003761459  000%  file write
         * 020524875  000%  class load
         * 221239333  001%  execute
         */



        stopWatch.stop();
        stopWatch.start("compile");

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        StringBuilder builder = new StringBuilder();
        builder.append("package pkg2; ").append("\r\n");
        builder.append("import java.util.HashMap; ").append("\r\n");
        builder.append("import java.util.Map; ").append("\r\n");
        builder.append("import java.util.List; ").append("\r\n");
        builder.append("import java.lang.Integer; ").append("\r\n");
        builder.append("import org.apache.commons.collections4.properties.SortedProperties; ").append("\r\n");


        builder.append("public class C {").append("\r\n");

        //
        for(int i=0 ;i<100 ;i++) {
            builder.append("    public Map<String, Object> meth" + i + "(Map<String, Object> parameter) {").append("\r\n");
            builder.append("        Map<String, Object> map = new HashMap();").append("\r\n");

            for(int cnt = 0 ;cnt < 400 ;cnt ++) {
                builder.append("        if( ");
                for (int j = 0; j < 5; j++) {
//                    if (j % 5 == 0) {
//                        //list
//                    } else {
                    builder.append("    (Integer)parameter.get(\"PARAM_").append(j).append("\") > 0").append(" && ");
//                    }
                }
                builder.append("            true ");
                builder.append("        ) {").append("\r\n");
                builder.append("            map.put(\"홍길동\", \"" + i + "\");").append("\r\n");
                builder.append("        }").append("\r\n");
            }

            builder.append("        return map;").append("\r\n");
            builder.append("    }").append("\r\n");
        }
        //

        builder.append("    public Map<String, Object> meth(Map<String, Object> parameter) {");

        builder.append("        SortedProperties p = new SortedProperties();");     //외부 library 사용가능 확인
        builder.append("        Map<String, Object> map = new HashMap();");


        for(int i=0 ;i<100 ;i++) {
            builder.append("        map = meth" + i +"(parameter);").append("\r\n");
        }
        builder.append("        return map;").append("\r\n");
        builder.append("    }").append("\r\n");

        builder.append("}").append("\r\n");

        System.out.println("java length : " + builder.length());

        // Now compile two units from strings:
        compiler.compile(new Resource[] {

                new StringResource(
                        "pkg2/C.java",
                        builder.toString()
                )
        });

        stopWatch.stop();
        stopWatch.start("file write");

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/C.class"));
        out.write(classes.get("pkg2/C.class"));
        out.flush();
        out.close();

        stopWatch.stop();
        stopWatch.start("class load");

        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/C.class", "pkg2.C");


        stopWatch.stop();
        stopWatch.start("execute");

        Object obj = a.newInstance();

        System.out.println("object : " + obj);

        Map map = new HashMap();
        for(int i = 0 ;i<50 ;i++) {
            map.put("PARAM_" + i, 1);
        }
        Object result = a.getMethod("meth", Map.class).invoke(obj, map);
        System.out.println("result :" + result);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }


    @Test
    public void big2() throws Exception {
        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/C.class", "pkg2.C");


        Map map = new HashMap();
        for(int i = 0 ;i<50 ;i++) {
            map.put("PARAM_" + i, 1);
        }

        long dttm = 0;

        for(int i = 0 ;i<1000 ;i++) {
//            int index = i % 50;
//
//            map.put("PARAM_" + index, i);



            long start = System.currentTimeMillis();
            Object obj = a.newInstance();
//            System.out.println("object : " + obj);
            Object result = a.getMethod("meth", Map.class).invoke(obj, map);
//            System.out.println("result :" + result);

            dttm += System.currentTimeMillis() - start;

        }

        System.out.println("dttm:" + dttm);
        System.out.println("avg: " + dttm/1000);

    }


}
