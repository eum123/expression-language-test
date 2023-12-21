package antlr.sample;

import antlr.SampleBaseVisitor;
import antlr.SampleLexer;
import antlr.SampleParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.jupiter.api.Test;

public class SampleAntlr {
    @Test
    public void test() throws Exception {

        SampleLexer sampleLexer = new SampleLexer(CharStreams.fromString("[].contains(1) ;"));
//
//        System.out.println(sampleLexer);
//
//        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(sampleLexer);
//
        SampleParser parser = new SampleParser(tokens);
//
//
//        System.out.println(parser.getContext().getText());

//        ParseTree tree = parser.expr().
//
//        System.out.println("result:"+tree.toStringTree(parser));

        // Make AST from prog and print the tree

          SampleParser.RContext ctx = parser.r();

        System.out.println(ctx);

        ExprTree AST = new BuildAstVisitor().visitR(ctx).getExprTree();
        System.out.println(AST);

//        ExprTree AST = (ExprTree)new BuildAstVisitor().visitProg(ctx);
//        AST.children.forEach(node -> new AstCall().Call(node, 0));
//
//        // Evaluate AST result
//        Evaluate Evaluator = new Evaluate();
//        AST.children.forEach(node -> System.out.println(Evaluator.evaluate(node)));
    }
}
