package nashorn;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.script.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class NashornTest {

    String script;

    @BeforeEach
    public void init() throws Exception {
        script = Files.readAllLines(Paths.get(
                ClassLoader.getSystemResource("script/일반_공통_보상한도금액사이값입력가능금액기준표_001.js").toURI())
        ).stream().collect(Collectors.joining("\n"));
    }
    @Test
    public void test() throws Exception {
        log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

        NashornScriptEngine se = (NashornScriptEngine)new ScriptEngineManager()
                .getEngineByName("Nashorn");

        long start = System.currentTimeMillis();

        Map map = new HashMap();

        for(int i = 0 ; i<100; i++) {
            CompiledScript cs = se.compile("var a_" + i +" = " + script);

            map.put("a_" + i, cs);

            log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        }

        Bindings bindings = new SimpleBindings();

        ((CompiledScript)map.get("a_56")).eval(bindings);

        log.debug("{}", System.currentTimeMillis() - start);

        log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
}
