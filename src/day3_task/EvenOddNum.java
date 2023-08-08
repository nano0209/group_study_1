package day3_task;
/*Task 2: Write a program to Check whether the number is even or odd using switch statement

 */

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();

        switch (num%2){
            case 0:
                System.out.println(num + "is an even number");
                break;
            case 1:
                System.out.println(num + " is a odd number");
                break;


        }

    }
}
