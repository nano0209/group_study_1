package day12;

public class StaticExample {

    String instanceExample = "instance variable";

    static String staticVariable = "static example";

    public void staticMethod(){
        System.out.println("This is static method");
    }

    static {
        System.out.println("This is first example");
        System.out.println("staticVariable = " + staticVariable);

    }
}
