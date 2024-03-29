package janino;

import org.codehaus.janino.ExpressionEvaluator;
import org.junit.jupiter.api.Test;

public class JaninoTest {
    @Test
    public void test() throws Exception {
        long start = System.currentTimeMillis();

        ExpressionEvaluator ee = new ExpressionEvaluator("홍길동 > 1",
                boolean.class,
                new String[] {"홍길동"},
                new Class[] {int.class});

        Boolean value = (Boolean) ee.evaluate(new Object[] {new Integer(0)});

        System.out.println(value);

        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testA() throws Exception {
        long start = System.currentTimeMillis();

        ExpressionEvaluator ee = new ExpressionEvaluator("홍길동 > 1",
                boolean.class,
                new String[] {"홍길동"},
                new Class[] {int.class});

        Boolean value = (Boolean) ee.evaluate(new Object[] {new Integer(0)});

        System.out.println(value);

        System.out.println(System.currentTimeMillis() - start);
    }


}
