package antlr.my;


import antlr.my.gen.ExprBaseVisitor;
import antlr.my.gen.ExprParser;
import antlr.my.gen.ExprVisitor;

public class BuildAstVisitor extends ExprBaseVisitor<AstNodes> implements ExprVisitor<AstNodes> {
    @Override
    public AstNodes visitProg(ExprParser.ProgContext ctx) {

        ExprTree prog = new ExprTree();

        //EOF(;)를 제외하기 위해 -1을 함.
        for(int i=0; i<ctx.getChildCount() -1; i++) {
            prog.InsertNode(visit(ctx.getChild(i)));
        }

        return new AstNodes(prog);
    }


    @Override
    public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) {
        String opText = ctx.op.getText();
        Operator op;
        switch(opText) {
            case "+":
                op = Operator.ADD;
                break;
            case "-":
                op = Operator.SUB;
                break;
            case "*":
                op = Operator.MUL;
                break;
            default:
                op = Operator.DIV;
                break;
        }

        return new AstNodes(
                op,
                visit(ctx.getChild(0)),
                visit(ctx.getChild(2))
        );
    }

    @Override
    public AstNodes visitAtomExpr(ExprParser.AtomExprContext ctx) {

        //type 구분
        System.out.println("int?" + ctx.atom().INT());
        System.out.println("double?"+ ctx.atom().DOUBLE());


        AstNodes node = new AstNodes(Operator.atom, null, null);

        //설정의 값을 저장한다.
        //node.setResult(Double.parseDouble(ctx.getText()));
        node.setResult(ctx.getText());


        return node;
    }

    @Override
    public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

}
