package antlr.my;

import antlr.my.gen.ExprLexer;
import antlr.my.gen.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MyMain {
    public static void main(String ...args) throws Exception {
        String data = "(1 + 2) * 3;";
        //data = "(a >    10 || 한글 == \"값\") && \"값\" != 변수 ;";
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(data));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        ExprParser.ProgContext ctx = parser.prog();
        ExprTree tree = new BuildAstVisitor().visitProg(ctx).getExprTree();

        System.out.println("tree========");
        tree.children.forEach(node -> new AstCall().Call(node, 0));
        System.out.println("============");

        tree.children.forEach(node -> System.out.println(Evaluate.evaluate(node)));

    }

    public static void performance() {
        /**
         * data : (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12;
         * count : 10,000
         * duration:1,137 ms
         */

        long start = System.currentTimeMillis();

        String data = "(1 + 2) * 3;";

        for(int i=0 ;i<1 ;i++) {

            ExprLexer lexer = new ExprLexer(CharStreams.fromString(i + " + " + data));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);

            ExprParser.ProgContext ctx = parser.prog();
            ExprTree tree = new BuildAstVisitor().visitProg(ctx).getExprTree();

            System.out.println("tree========");
            tree.children.forEach(node -> new AstCall().Call(node, 0));
            System.out.println("============");

            tree.children.forEach(node -> System.out.println(Evaluate.evaluate(node)));


        }

        System.out.println("duration:" + (System.currentTimeMillis() - start));
    }
}
