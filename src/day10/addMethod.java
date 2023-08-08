package day10;

import java.util.ArrayList;

public class addMethod {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();

        num.add(20);
        num.add(30);
        num.add(40);
        num.add(60);
        num.add(70);
        System.out.println(num);
        System.out.println(num.size());

        num.add(100);
        num.add(200);
        System.out.println(num);

        num.remove(3);
        System.out.println(num);

        System.out.println(num.isEmpty());



    }
}