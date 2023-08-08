package day9_tasks;
/*
Constructor for Person Class with instance Variables Age, Name, Job
2 Overloaded constructor
1-> initializes name and Job
2-> initializes age and name
 */

public class Person {

    String name;
    int age;
    String job;



    public Person (String name, String job){
        this.name = name;
        this.job = job;

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    }



