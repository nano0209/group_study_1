package day6_tasks;

public class NestedLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("*");
            }


            System.out.println();
            i++;
        }
    }
}