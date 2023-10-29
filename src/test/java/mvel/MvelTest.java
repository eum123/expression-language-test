package mvel;

import org.junit.jupiter.api.Test;
import org.mvel2.MVEL;
import org.mvel2.jsr223.MvelScriptEngineFactory;
import org.mvel2.optimizers.OptimizerFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MvelTest {


    @Test
    public void list() throws Exception {


        //Serializable compiled = MVEL.compileExpression("한글 + b");
        //Object obj = MVEL.executeExpression(compiled, null, simpleBindings);

        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("b", 2);

        Object obj = MVEL.eval("[1, 2].contains(한글)", map);

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

    @Test
    public void clean_test() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", 1);
        map.put("b", 2);

        OptimizerFactory.setDefaultOptimizer(OptimizerFactory.DYNAMIC);
        MVEL.COMPILER_OPT_ALLOW_NAKED_METH_CALL = false;
        MVEL.COMPILER_OPT_ALLOW_OVERRIDE_ALL_PROPHANDLING = false;
        MVEL.COMPILER_OPT_ALLOW_RESOLVE_INNERCLASSES_WITH_DOTNOTATION = false;
        MVEL.COMPILER_OPT_SUPPORT_JAVA_STYLE_CLASS_LITERALS = false;

        Object obj = MVEL.eval("MY한글 < b", map);

        System.out.println(obj);
    }

    @Test
    public void date_test() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", "2014-10-28 13:00:00");
        map.put("b", 2);

        Object obj = MVEL.eval("MY한글 < \"2014-10-27 13:00:00\"", map);

        System.out.println(obj);
    }

    @Test
    public void test() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", 1);
        map.put("b", 2);

        Object obj = MVEL.eval("MY한글 < (b-1)", map);

        System.out.println(obj);
    }

    @Test
    public void test1() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", 1);
        map.put("b", 2);

        Object obj = MVEL.eval("MY한글 > 0 ? true : false", map);

        System.out.println(obj);
    }

    @Test
    public void indexOf() throws Exception {

        Map map = new HashMap<>();
        map.put("MY한글", "홍길동");
        map.put("b", 2);

        Object obj = MVEL.eval("MY한글.indexOf(\"1홍\")", map);

        System.out.println(obj);
    }



}


