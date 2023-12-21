package antlr.my;

public class Evaluate {
    public static String evaluate(AstNodes node) {
        if(node == null || node.op == null)
            return "-";
        if(node.left != null) {
            evaluate(node.left);
        }
        if(node.right != null) {
            evaluate(node.right);
        }

        switch(node.op) {
            case ADD:
                return node.result = "(" + node.left.result + "+" + node.right.result + ")";
            case MUL:
                return node.result = "(" + node.left.result + "*" + node.right.result + ")";
            case DIV:
                return node.result = "(" + node.left.result + "/" + node.right.result + ")";
            case atom:
                return node.result;

            default:
                return "-";
        }
    }
}
