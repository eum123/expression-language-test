package jci;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.jci.ReloadingClassLoader;
import org.apache.commons.jci.compilers.CompilationResult;
import org.apache.commons.jci.compilers.JavaCompiler;
import org.apache.commons.jci.compilers.JavaCompilerFactory;
import org.apache.commons.jci.compilers.JavaCompilerSettings;
import org.apache.commons.jci.listeners.ReloadingListener;
import org.apache.commons.jci.monitor.FilesystemAlterationMonitor;
import org.apache.commons.jci.readers.FileResourceReader;
import org.apache.commons.jci.stores.FileResourceStore;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;


@Slf4j
public class JCIInnerClassTest {
    @Test
    public void test() throws Exception {



//        final URL[] urls = new URL[values.length];
//        for (int i = 0; i < urls.length; i++) {
//        urls[i] = new File(values[i]).toURL();
//        }
//        classloader = new URLClassLoader(urls);

        String[] sources = new String[]{"a.pkg1.C.java", "a.pkg1.D.java"};
        String sourceDir = "/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/";

        ReloadingClassLoader classloader = new ReloadingClassLoader(this.getClass().getClassLoader());
        ReloadingListener listener = new ReloadingListener();

        listener.addReloadNotificationListener(classloader);

        FilesystemAlterationMonitor fam = new FilesystemAlterationMonitor();
        fam.addListener(new File(sourceDir), listener);
        fam.start();


        //sourceDir = "/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/";
        JavaCompiler compiler = new JavaCompilerFactory().createCompiler("eclipse");



        final JavaCompilerSettings settings = compiler.createDefaultSettings();
//        settings.setSourceVersion("8");
//        settings.setTargetVersion("8");
        settings.setDebug(true);

        //URLClassLoader classLoader = new URLClassLoader(new URL[] {new File(sourceDir).toURI().toURL()});

        CompilationResult result = compiler.compile(sources, new FileResourceReader(new File(sourceDir)), new FileResourceStore(new File(sourceDir)), classloader, settings);

        System.out.println( result.getErrors().length + " errors");
        Arrays.stream(result.getErrors()).forEach(x -> {
//            System.out.println(x.getMessage());
//            System.out.println(x.getFileName());
//            System.out.println(x.getStartLine());
//            System.out.println(x.getEndLine());
//            System.out.println(x.getStartColumn());
//            System.out.println(x.getEndColumn());


            System.out.println(x);
        });


        System.out.println( result.getWarnings().length + " warnings");


        Thread.sleep(3000);

        Class c = classloader.loadClass("a.pkg1.D");

        System.out.println(c);

        Object o = c.newInstance();

        Method m = c.getDeclaredMethod("aaa");
        m.invoke(o);

        fam.stop();
    }
}
