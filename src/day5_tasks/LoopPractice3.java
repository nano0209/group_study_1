package day5_tasks;

import java.util.Scanner;

public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String answ ="";


        do{
            System.out.println("Enter a number");
            int num = input.nextInt();
            System.out.println("Do you want to add more");
            answ = input.next();
            if(num > largest) {
                largest = num;
            }else if (num < smallest){
                smallest = num;
            }

        }while(answ.equalsIgnoreCase("Y"));
        System.out.println("Largest"+ largest);
        System.out.println("Smallest" + smallest);

    }
}
