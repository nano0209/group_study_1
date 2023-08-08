package day9_tasks;
/*
Declare method called Months that prints the months passed as VarArgs

 */

public class Month {


    public static void month(String... month) {
        System.out.println("Months" + month.length);
        for (String name : month ) {
            System.out.println("Print" + name);
        }


        }

    public static void main(String[] args) {
        month("January", "February", "March");
        month("April", "MAy");
        month("June");
    }


}