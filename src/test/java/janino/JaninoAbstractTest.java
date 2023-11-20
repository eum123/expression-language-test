package janino;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.ICompiler;
import org.codehaus.commons.compiler.util.resource.MapResourceCreator;
import org.codehaus.commons.compiler.util.resource.MapResourceFinder;
import org.codehaus.commons.compiler.util.resource.Resource;
import org.codehaus.commons.compiler.util.resource.StringResource;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JaninoAbstractTest {
    @Test
    public void test() throws Exception {
        ICompiler compiler = CompilerFactoryFactory
                .getDefaultCompilerFactory(Thread.currentThread().getContextClassLoader())
                .newCompiler();

        compiler.setVerbose(true);

        // Store generated .class files in a Map:
        Map<String, byte[]> classes = new HashMap<String, byte[]>();

        MapResourceCreator mapResourceCreator = new MapResourceCreator(classes);

        compiler.setClassFileCreator(mapResourceCreator);

        MapResourceFinder mapResourceFinder = new MapResourceFinder(classes);

        StringBuilder builder = new StringBuilder();
        builder.append("package pkg1;").append("\r\n");
        builder.append("import com.example.janino.AbstractSpread;").append("\r\n");
        builder.append("import java.util.Map;").append("\r\n");
        builder.append("public class A extends AbstractSpread {").append("\r\n");
        builder.append("    public void executeSpread(Map map) {").append("\r\n");
        builder.append("        System.out.println(map);").append("\r\n");
        builder.append("        record();").append("\r\n");
        builder.append("    }").append("\r\n");
        builder.append("}").append("\r\n");

        List<Resource> resources = new ArrayList();
        resources.add(new StringResource(
                "pkg1/A.java",
                builder.toString()
        ));


        // Now compile two units from strings:
        compiler.compile(resources.toArray(new Resource[resources.size()]));

        System.out.println(classes);

        FileOutputStream out = new FileOutputStream(new File("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class"));
        out.write(classes.get("pkg1/A.class"));
        out.flush();

        out.close();

        CustomClassLoader loader = new CustomClassLoader();
        Class a = loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/A.class", "pkg1.A");

        Object obj = a.newInstance();

        System.out.println("object : " + obj);

        Map map = new HashMap();
        map.put("홍길동", 1);
        Object result = a.getMethod("executeSpread", Map.class).invoke(obj, map);
        System.out.println("result :" + result);
    }
}
