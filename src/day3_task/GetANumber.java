package day3_task;
/*
Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive
 */

import java.util.Scanner;

public class GetANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number > 0) {


            System.out.println(" positive ");

        } else if (number < 0) {

            System.out.println("negative");

        } else {
            System.out.println("non of them");
        }

    }

    }

