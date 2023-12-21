package antlr.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExprTree {
    public ArrayList<AstNodes> children;
    private static Map<String, Double> variables;

    ExprTree() {
        variables = new HashMap<>();
        children = new ArrayList<AstNodes>();
    }

    public boolean InsertNode (AstNodes Node) {
        if(Node != null)
            return children.add(Node);
        return false;
    }

    public static void setVariable (String key, Double value) {
        variables.put(key, value);
    }
    public static double getVariable (String key) {
        return variables.get(key);
    }
}
