package openhft;

import net.openhft.compiler.CompilerUtils;
import org.junit.jupiter.api.Test;

public class CompileTest {
    @Test
    public void test() throws Exception {
        String className = "mypackage.MyClass";
        String javaCode = "package mypackage;\n" +
                "public class MyClass extends HashMap {\n" +
                "    public void run() {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "    }\n" +
                "}\n";

        CompilerUtils.addClassPath(System.getProperty("java.class.path"));

        
        Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);



        System.out.println(aClass);
    }

}
