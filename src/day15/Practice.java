package day15;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Practice {
    public static void main(String[] args) {


        String str = "hhhh4jjjjzzzzz4";
        List<String> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) + "");
            set.add(str.charAt(i));

        }

        System.out.println("set = " + set);
        System.out.println("list = " + list);


        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if (it.next().equals("j")) {
                it.remove();
            }
        }
            System.out.println(list);
        }
    }

