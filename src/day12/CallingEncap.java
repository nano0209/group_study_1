package day12;

public class CallingEncap {
    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation();
        System.out.println("obj1.getName() = " + obj1.getName());
        obj1.Setter("Mary");
        System.out.println(obj1.getName());
    }
}