package antlr.my;

public class AstCall {
    public void Call(String name, AstNodes node, int depth) {

        if(node == null || node.op == null) return;
        for(int i=0; i<depth; i++) {
//            System.out.print("\t");
        }


        switch(node.op) {

            case atom:
//                System.out.println(name + "::node:" + node);
                break;

            default:
//                System.out.println(name +"::node.op.name():" + node.op.name());

                Call(name, node.left, ++depth);
                Call(name, node.right, depth--);

                break;
        }


//        switch(node.op) {
//            case sqrt:
//                depth++;
//                System.out.println("sqrt");
//                Call(node.left, depth--);
//                break;
//            case num:
//                System.out.println(node.result);
//                break;
//            case var:
//                System.out.println(node.variableName);
//                break;
//            default:
//                System.out.println(node.op.name());
//                Call(node.left, ++depth);
//                Call(node.right, depth--);
//                break;
//        }
    }
}
