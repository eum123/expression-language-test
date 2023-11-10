package parsii;

import org.junit.jupiter.api.Test;
import parsii.eval.Expression;
import parsii.eval.Parser;
import parsii.eval.Scope;
import parsii.eval.Variable;

/**
 * 간단한 수식만 됨.
 */
public class ParsiiTest {
    @Test
    public void main() throws Exception {
        long start = System.currentTimeMillis();

        Scope scope = new Scope();
        Variable a = scope.getVariable("a");
        Expression expr = Parser.parse("3 + a * 4", scope);
        a.setValue(4);
        System.out.println(expr.evaluate());
        a.setValue(5);
        System.out.println(expr.evaluate());

        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void array() throws Exception {
        long start = System.currentTimeMillis();

        Scope scope = new Scope();;
        Variable a = scope.getVariable("a");
        Expression expr = Parser.parse("3 + a * 4 + pow(2, a)", scope);
        a.setValue(4);
        System.out.println(expr.evaluate());


        System.out.println(System.currentTimeMillis() - start);
    }
}
