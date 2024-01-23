package mvel;

import org.junit.jupiter.api.Test;
import org.mvel2.MVEL;
import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.integration.impl.MapVariableResolverFactory;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MvelJavaCallTest {
    @Test
    public void test() {
        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("function age() { var a = 1; if(a == 1) { return 1;} else {return '10'} }; def name() { System.out.println(\"bar\") };", functionFactory);

        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());

        VariableResolverFactory myVarFactory = new MapVariableResolverFactory();
        myVarFactory.setNextFactory(functionFactory);
        Serializable s = MVEL.compileExpression("age();");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj);
    }

    @Test
    public void testB() {

        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());

        VariableResolverFactory myVarFactory = new MapVariableResolverFactory();
        Serializable s = MVEL.compileExpression("var a = 1; if(a == 1) { return 1;} else {return '10'}");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj);
    }

    public static int getAge() {
        return 10;
    }

    @Test
    public void testC() {

        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());

        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("def aaa() { return ruleFunction.getAge(); }; def name() { System.out.println(\"bar\") };", functionFactory);

        VariableResolverFactory myVarFactory = new MapVariableResolverFactory(map);
        myVarFactory.setNextFactory(functionFactory);

        Serializable s = MVEL.compileExpression("aaa();");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj);
    }


    @Test
    public void test_if() {
        //define common functiohn
        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("def aaa() { return ruleFunction.getAge(); }; def name() { System.out.println(\"bar\") };", functionFactory);

        //execute
        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());
        map.put("가입금액증감단위", -1);
        VariableResolverFactory myVarFactory = new MapVariableResolverFactory(map);
        myVarFactory.setNextFactory(functionFactory);

        Serializable s = MVEL.compileExpression("if(가입금액증감단위<=0){가입금액증감단위=1} return 가입금액증감단위");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj);
    }

    @Test
    public void test_var() {
        //define common functiohn
        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("def aaa() { return ruleFunction.getAge(); }; def name() { System.out.println(\"bar\") };", functionFactory);

        //execute
        Map map = new HashMap<>();
        map.put("ruleFunction", new MvelJavaCallTest());
        map.put("건물가입금액", 1000);
        map.put("임차자가입금액", 10);
        VariableResolverFactory myVarFactory = new MapVariableResolverFactory(map);
        myVarFactory.setNextFactory(functionFactory);

        Serializable s = MVEL.compileExpression("var 건물임차자가입금액;\n var 납입주기; \n 건물임차자가입금액 = 건물가입금액 + 임차자가입금액; \n return 건물임차자가입금액;");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj);
    }

    @Test
    public void test_objectreturn() {
        //define common functiohn
        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("def aaa() { return ruleFunction.getAge(); }; def name() { System.out.println(\"bar\") };", functionFactory);

        //execute
        Map map = new HashMap<>();
        map.put("ruleFunction", new MvelJavaCallTest());
        VariableResolverFactory myVarFactory = new MapVariableResolverFactory(map);
        myVarFactory.setNextFactory(functionFactory);

        Serializable s = MVEL.compileExpression("var 건물임차자가입금액 = { '단기요율' : 1, '장기일시납요율' : 2 }; return 건물임차자가입금액;");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj.getClass());
        System.out.println(obj);
    }

    @Test
    public void test_userCode() {
        //define common functiohn
        VariableResolverFactory functionFactory = new MapVariableResolverFactory();
        MVEL.eval("def aaa() { return ruleFunction.getAge(); }; def name() { System.out.println(\"bar\") };", functionFactory);

        //execute
        Map map = new HashMap<>();
        map.put("ruleFunction", new MvelJavaCallTest());
        map.put("{N}", "01");
        VariableResolverFactory myVarFactory = new MapVariableResolverFactory(map);
        myVarFactory.setNextFactory(functionFactory);

        Serializable s = MVEL.compileExpression("var 건물임차자가입금액 = '{N}'; return 건물임차자가입금액;");

        Object obj = MVEL.executeExpression(s, myVarFactory);

        System.out.println(obj.getClass());
        System.out.println(obj);
    }

    @Test
    public void javaMethodCall() {
        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());

        Object obj = MVEL.eval("ruleFunction.getAge()", map);

        System.out.println(obj);
    }

    @Test
    public void testObject() {
        Map map = new HashMap<>();
        map.put("한글", 1);
        map.put("ruleFunction", new MvelJavaCallTest());

        Object obj = MVEL.eval("ruleFunction.getAge()", map);

        System.out.println(obj);
    }

    @Test
    public void test_substr() {
        Map map = new HashMap<>();
        map.put("한글", "홍길동");
        map.put("ruleFunction", new MvelJavaCallTest());

        Object obj = MVEL.eval("new String(한글).substring(0, 1);", map);

        System.out.println(obj);
    }

    @Test
    public void test_isempty() {
        Map map = new HashMap<>();
        map.put("한글", "홍길동");
        map.put("value", null);
        map.put("ruleFunction", new MvelJavaCallTest());

        Object obj = MVEL.eval("value == 'undefined' || value == null || value == 'null' || value == '' || value.length == 0", map);

        System.out.println(obj);
    }

    @Test
    public void test_Object() {
        Map input = new HashMap<>();

        Map map = new HashMap<>();
        map.put("한글", "홍길동");
        map.put("value", null);
        map.put("ruleFunction", new MvelJavaCallTest());
        map.put("input", input);


        Object obj = MVEL.eval("input.put('name',한글);", map);

        System.out.println(obj);
        System.out.println(input);
    }

    @Test
    public void testdate() {
        Date d = new Date(45, 10, 1, 1, 1, 1);
        System.out.println(d);
    }


}
