package day15;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Mary", 25);
        map.put("Nina", 27);
        map.put("Joseph", 39);
        map.put("Mira", 40);

        System.out.println("map.entrySet():" + map.entrySet());

    }


}
