package antlr.my;

import antlr.my.gen.ExprLexer;
import antlr.my.gen.ExprParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MyMain {

    public static ThreadLocal<String> local = new ThreadLocal();

    public static void main(String ...args) throws Exception {
        String data = "(1 + 2) * 3;";
        //data = "(a >    10 || 한글 == \"값\") && \"값\" != 변수 ;";


        local.set("hone");


        CharStream stream = new ANTLRInputStream(data);
        ExprLexer lexer = new ExprLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser("hong", tokens);



        ExprParser.ProgContext ctx = parser.prog();
        ExprTree tree = new BuildAstVisitor().visitProg(ctx).getExprTree();

        System.out.println("tree========");
        tree.children.forEach(node -> new AstCall().Call("my", node, 0));
        System.out.println("============");

        tree.children.forEach(node -> System.out.println(Evaluate.evaluate(node)));

        local.remove();

    }

    @Test
    public  void performance() throws Exception {
        /**
         * data : (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12 + (1 + 2) * 3 / (4+5) * 2 / 29 * (12) / 12;
         * count : 10,000
         * duration:1,137 ms
         */

        long start = System.currentTimeMillis();


        for(int i=0 ;i<50000 ;i++) {

            String data = expressionGenerator();

            //System.out.println(data);

            CharStream stream = new ANTLRInputStream(i + " + " + data);

            ExprLexer lexer = new ExprLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser("hong", tokens);

            ExprParser.ProgContext ctx = parser.prog();
            ExprTree tree = new BuildAstVisitor().visitProg(ctx).getExprTree();

//            System.out.println("tree========");
            tree.children.forEach(node -> new AstCall().Call("", node, 0));
//            System.out.println("============");

            tree.children.forEach(node -> System.out.println(Evaluate.evaluate(node)));


        }

        System.out.println("duration:" + (System.currentTimeMillis() - start));
    }

    public String expressionGenerator() throws Exception {
        List<String> variables = Arrays.asList("대표보험종류세코드", "분납예정일자", "대표보험종류세코드", "기준일자");
        List<String> op = Arrays.asList("==", "<", ">", "!=");
        List<String> re = Arrays.asList("&&", "||");

        int count = (int)(Math.random() * 10);

        String expr = "";
        for(int i = 0 ;i < count ;i++) {
            expr = expr + " " +  variables.get((int)(Math.random() * variables.size())) + " "
                    + op.get((int)(Math.random() * op.size())) + " \"" + (int)(Math.random() * 100) + "\"" + " "
                    + re.get((int)(Math.random() * re.size()));
        }
        expr = expr + " 대표보험종류세코드 == \"999\"";

        return expr;
    }
}
