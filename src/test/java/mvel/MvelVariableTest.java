package mvel;

import org.junit.jupiter.api.Test;
import org.mvel2.MVEL;
import org.mvel2.jsr223.MvelScriptEngine;
import org.mvel2.jsr223.MvelScriptEngineFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MvelVariableTest {
    @Test
    public void test() throws Exception {
        MvelScriptEngineFactory factory = new MvelScriptEngineFactory();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        scriptEngineManager.registerEngineName( "mvel", factory);
        MvelScriptEngine scriptEngine = (MvelScriptEngine)scriptEngineManager.getEngineByName("mvel");

        SimpleBindings simpleBindings = new SimpleBindings();
        simpleBindings.put("a", 1);
        simpleBindings.put("b", 2);

        int c = (Integer) scriptEngine.eval("a + b", simpleBindings);
        assertEquals(c, 3);


    }

    @Test
    public void korea_test() throws Exception {


        //Serializable compiled = MVEL.compileExpression("한글 + b");
        //Object obj = MVEL.executeExpression(compiled, null, simpleBindings);

        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("b", 2);

        Object obj = MVEL.eval("한글 < b", map);

        System.out.println(obj);
    }

    @Test
    public void korea_english_test() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", 1);
        map.put("b", 2);

        Object obj = MVEL.eval("MY한글 < b", map);

        System.out.println(obj);
    }

}
