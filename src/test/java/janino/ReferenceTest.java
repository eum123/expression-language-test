package janino;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.ICompiler;
import org.codehaus.commons.compiler.util.ResourceFinderClassLoader;
import org.codehaus.commons.compiler.util.resource.MapResourceCreator;
import org.codehaus.commons.compiler.util.resource.MapResourceFinder;
import org.codehaus.commons.compiler.util.resource.Resource;
import org.codehaus.commons.compiler.util.resource.StringResource;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ReferenceTest {
    @Test
    public void test() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(Thread.currentThread().getContextClassLoader())
                .newCompiler();



        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();
        compiler.setClassFileCreator(new MapResourceCreator(classes));

        // Now compile two units from strings:
        compiler.compile(new Resource[] {
                new StringResource(
                        "pkg1/a.pkg1.A.java",
                        "package pkg1; public class A { public static int meth() { return pkg2.B.meth(); } }"
                ),
                new StringResource(
                        "pkg2/a.pkg1.B.java",
                        "package pkg2; public class B { public static int meth() { return 77;            } }"
                ),
        });

        // Set up a class loader that uses the generated classes.
        ClassLoader cl = new ResourceFinderClassLoader(
                new MapResourceFinder(classes),    // resourceFinder
                ClassLoader.getSystemClassLoader() // parent
        );

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class"));
        out.write(classes.get("pkg1/A.class"));
        out.flush();
        out.close();

        FileOutputStream out1 = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/B.class"));
        out1.write(classes.get("pkg2/B.class"));
        out1.flush();
        out1.close();

        CustomClassLoader loader = new CustomClassLoader();
        //참조 class load
        loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/B.class", "pkg2.B");

        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class", "pkg1.A");

        System.out.println(a);

        System.out.println(a.getDeclaredMethod("meth").invoke(null));

    }
}
