package day10;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Apple", "Banana", "Pear", "Grape", "Raspberry"));

        System.out.println(str.toString());
        System.out.println(str.removeIf(each->each.toLowerCase().contains("e")));
        System.out.println(str);


    }
}
