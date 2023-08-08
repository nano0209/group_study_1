package day9_tasks;
/*
Constructor for Car Class with instance Variables Color,  Make, Year
2 Overloaded constructor
1-> initializes color and make
2-> initializes color and year
3-> initialize all variables
 */
/*
Declare a method print()
overloaded version printing. only 2 variables
overloaded version printing 3 variables
 */

public class Car {
    String color;
    String year;
    String make;


    public void print(){
        System.out.println("text");


    }
    public void print(String color, String year, String make){

        this.color = color;
        this.year = year;
        this.make = make;

        System.out.println(this.color);
        System.out.println(this.year);
        System.out.println(this.make);


    }


}
