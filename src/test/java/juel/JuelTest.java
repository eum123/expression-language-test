package juel;

import de.odysseus.el.ExpressionFactoryImpl;
import de.odysseus.el.ObjectValueExpression;
import de.odysseus.el.TreeValueExpression;
import de.odysseus.el.tree.Tree;
import de.odysseus.el.tree.TreeBuilder;
import de.odysseus.el.tree.TreeBuilderException;
import de.odysseus.el.tree.TreeStore;
import de.odysseus.el.tree.impl.Cache;
import de.odysseus.el.util.SimpleContext;
import org.junit.jupiter.api.Test;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JuelTest {
    @Test
    public void test() {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        TreeValueExpression e = factory.createValueExpression(context, "#{pi/2}", Object.class);
        PrintWriter out = new PrintWriter(System.out);
        e.dump(out);
        out.flush();
        System.out.println(e.isDeferred()); // true
        System.out.println(e.isLeftValue()); // false
    }

    @Test
    public void test1() {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        ObjectValueExpression e = factory.createValueExpression(Math.PI, Double.class);
        context.setVariable("pi", e);

        System.out.println(e.getValue(context));
    }

    @Test
    public void test3() throws Exception {

        long start = System.currentTimeMillis();
        for(int i=0 ; i<10000 ;i++) {
            test6();
        }
        System.out.println(System.currentTimeMillis() - start);
    }


    @Test
    public void test2() throws Exception {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();

        SimpleContext context = new SimpleContext(); // more on this here...


        // map function math:max(int, int) to java.lang.Math.max(int, int)
        context.setFunction("math", "max", Math.class.getMethod("max", int.class, int.class));

// map variable foo to 0
        context.setVariable("foo", factory.createValueExpression(3, int.class));

        // parse our expression
        ValueExpression e = factory.createValueExpression(context, "${math:max(foo,bar)}", int.class);

// set value for top-level property "bar" to 1
        factory.createValueExpression(context, "${bar}", int.class).setValue(context, 1);

// get value for our expression
//        System.out.println(e.getValue(context)); // --> 1r

        context.setFunction("", "ddd", JuelTest.class.getMethod("greateThan", Integer.class, Integer.class));
        ValueExpression e1 = factory.createValueExpression(context, "${ddd(foo,bar)}", boolean.class);
        System.out.println(e1.getValue(context)); // --> 1r
    }

    public static boolean greateThan(Integer left, Integer right) {
        return left > right;
    }


    @Test
    public void test4() {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        TreeValueExpression e = factory.createValueExpression(context, "#{1 + 2}", Object.class);
        PrintWriter out = new PrintWriter(System.out);
        e.dump(out);
        out.flush();
        System.out.println(e.isDeferred()); // true
        System.out.println(e.isLeftValue()); // false

        System.out.println(e.getValue(context));
    }

    @Test
    public void test5() {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        TreeValueExpression e = factory.createValueExpression(context, "#{1 < 2}", Object.class);
        PrintWriter out = new PrintWriter(System.out);
        e.dump(out);
        out.flush();
        System.out.println(e.isDeferred()); // true
        System.out.println(e.isLeftValue()); // false

        System.out.println(e.getValue(context));
    }

    @Test
    public void test6() throws Exception {


        //TODO 스크립트에서 사용하는 숫자는 long 으로 설정된다.

        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        context.setVariable("한글", factory.createValueExpression(2, int.class));

        List a = new ArrayList();
        a.add(1L);
        a.add(2L);
        context.setVariable("ll", factory.createValueExpression(a, ArrayList.class));

       // System.out.println(a.contains(2L));

       // context.setFunction("", "contains", JuelTest.class.getMethod("contains", List.class, Object.class));
        TreeValueExpression e = factory.createValueExpression(context, "#{한글 >= 2 && ll.contains(2)}", Object.class);

       //System.out.println(e.getValue(context));
    }

    public static boolean contains(List list, Object obj) {
        System.out.println(list + "dddd:" + list.contains((Long)obj));
        return list.contains(obj);
    }


    @Test
    public void test7() throws Exception {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        context.setVariable("한글", factory.createValueExpression(2, long.class));

        List a = new ArrayList();
        a.add("a");
        a.add("한글");
        context.setVariable("리스트", factory.createValueExpression(a, ArrayList.class));

        // System.out.println(a.contains(2L));

        // context.setFunction("", "contains", JuelTest.class.getMethod("contains", List.class, Object.class));
        TreeValueExpression e = factory.createValueExpression(context, "#{리스트.contains(\"한글\")}", Object.class);

        System.out.println(e.getValue(context));
    }

    @Test
    public void test8() throws Exception {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        context.setVariable("적용시기", factory.createValueExpression("2014-10-27 12:00:00", String.class));

        TreeValueExpression e = factory.createValueExpression(context, "#{적용시기 > \"2014-10-27 13:00:00\"}", Object.class);

        System.out.println(e.getValue(context));
    }

    @Test
    public void test9() throws Exception {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        context.setVariable("적용시기", factory.createValueExpression(10, long.class));
        context.setVariable("적용", factory.createValueExpression(5, long.class));

        TreeValueExpression e = factory.createValueExpression(context, "#{적용시기 > (적용 * 4)}", Object.class);

        System.out.println(e.getValue(context));
    }

    @Test
    public void test10() throws Exception {
        ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
        SimpleContext context = new SimpleContext(); // more on this here...
        context.setVariable("적용시기", factory.createValueExpression("홍길동", String.class));

        TreeValueExpression e = factory.createValueExpression(context, "#{적용시기.contains(\"길\")}", Object.class);

        System.out.println(e.getValue(context));
    }

}
