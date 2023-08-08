package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseMethod {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.addAll(Arrays.asList("book", "pen", "pencil", "notebook"));
        System.out.println(list);

        list.addAll(2, Arrays.asList("marker"));
        System.out.println(list);


       // Collections.reverse(list);
       // System.out.println(list);

        Collections.swap(list, 1, 4);
        System.out.println(list);






    }
}
