package a.pkg1;
import jci.MyClass;


public class B extends MyClass {
    public static int meth() {
        return 200;
    }

    public String name() {
        return super.getName();
    }
}