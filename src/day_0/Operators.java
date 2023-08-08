package day_0;

public class Operators {
    public static void main(String[] args) {
        int t = 100;
        int p = -++t * -t-- / t++ + --t;
        //      -101 *-101 /  100 +  100

        System.out.println("t = " + t);
        System.out.println("p = " + p);
    }
}
