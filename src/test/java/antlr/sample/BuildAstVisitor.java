package antlr.sample;

import antlr.SampleParser;
import antlr.SampleVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BuildAstVisitor implements SampleVisitor<AstNodes> {

    @Override
    public AstNodes visitR(SampleParser.RContext ctx) {
        ExprTree prog = new ExprTree();

        for(int i=0; i<ctx.getChildCount()-1; i++) {
            prog.InsertNode(visit(ctx.getChild(i)));
        }

        return new AstNodes(prog);
    }

    @Override
    public AstNodes visitArrayExpr(SampleParser.ArrayExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitJavaVariableExpr(SampleParser.JavaVariableExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitAtomExpr(SampleParser.AtomExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitOrExpr(SampleParser.OrExprContext ctx) {
        AstNodes nodes = new AstNodes(Operator.OR, visit(ctx.getChild(0)), visit(ctx.getChild(2)));
        return null;
    }

    @Override
    public AstNodes visitPlusplusExpr(SampleParser.PlusplusExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitMinusExpr(SampleParser.MinusExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitMinminExpr(SampleParser.MinminExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitFunctionExpr(SampleParser.FunctionExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitNotExpr(SampleParser.NotExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitAddExpr(SampleParser.AddExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitMulExpr(SampleParser.MulExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitRelationExpr(SampleParser.RelationExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitEqualExpr(SampleParser.EqualExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitAndExpr(SampleParser.AndExprContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitArray(SampleParser.ArrayContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitJava_variable(SampleParser.Java_variableContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitFunction(SampleParser.FunctionContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitArguments(SampleParser.ArgumentsContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitExprAtom(SampleParser.ExprAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitIntAtom(SampleParser.IntAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitDoubleAtom(SampleParser.DoubleAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitIdAtom(SampleParser.IdAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitStringAtom(SampleParser.StringAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visitVariableAtom(SampleParser.VariableAtomContext ctx) {
        return null;
    }

    @Override
    public AstNodes visit(ParseTree parseTree) {

        return null;
    }

    @Override
    public AstNodes visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public AstNodes visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public AstNodes visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
