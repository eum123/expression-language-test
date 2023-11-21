package janino;

import org.junit.jupiter.api.Test;

public class ClassLoaderTest {
    @Test
    public void test() throws Exception {
        CustomClassLoader loader = new CustomClassLoader();

        Class c =  loader.load("/Users/manjineum/Desktop/00.project/99.my/30.EL/expression-language-test/src/test/resources/classes/RuleId.class", "pkg2.RuleId");

    }
}
