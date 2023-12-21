package antlr.my;


import lombok.ToString;

enum Operator {
    ADD, MUL, SUB, DIV, atom
}

@ToString
public class AstNodes {
    public AstNodes left;
    public AstNodes right;
    public Operator op;
    public String result;
    public boolean isCalculated = false;
    public String variableName;

    private ExprTree tree;

    AstNodes(ExprTree tree) {
        this.tree = tree;
    }

    AstNodes(Operator op, AstNodes left, AstNodes right) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public void setResult(String value) {
        this.isCalculated = true;
        this.result = value;
    }

    public void setVariableName(String name) {
        this.variableName = name;
    }

    public ExprTree getExprTree() {
        return tree;
    }

}
