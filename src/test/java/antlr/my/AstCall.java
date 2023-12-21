package antlr.my;

public class AstCall {
    public void Call(AstNodes node, int depth) {

        if(node == null || node.op == null) return;
        for(int i=0; i<depth; i++) {
            System.out.print("\t");
        }


        switch(node.op) {

            case atom:
                System.out.println("node:" + node);
                break;

            default:
                System.out.println("node.op.name():" + node.op.name());

                Call(node.left, ++depth);
                Call(node.right, depth--);

                break;
        }
    }
}
