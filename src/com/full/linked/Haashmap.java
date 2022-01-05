package com.full.linked;
import java.util.*;

public class Haashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        for (Map.Entry k: map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(6, "Mango");
        map1.put(7, "Apple");
        map1.put(8, "Banana");

        Set set = map.entrySet();
        System.out.println("Set view elements : " + set);

        map.putAll(map1);
        System.out.println(map);


        System.out.println("The size of the map is : ");
        System.out.println(map1.size());

        Iterator<Map.Entry<Integer,String>> iterator =  map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }
}
