package day7_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        String [] arr= {"Monday", "Tuesday", "Wendsday", "Thursday"};

        List<String>list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List" + list);
    }
}
