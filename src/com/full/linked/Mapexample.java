package com.full.linked;

import java.util.*;


public class Mapexample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(2,"Red");
        map.put(3,"white");
        map.put(1,"Pink");
        map.put(4,"Green");
        for (Map.Entry<Integer,String> k:map.entrySet()) {
            System.out.println(k.getKey()+ " "+k.getValue());
        }

        System.out.println("The map elements : " + map.headMap(4));             //head map is used to get map values to given value
        System.out.println("The map elements : "+map.headMap(4,true));    // to get mention map pair

        TreeMap<Integer,String> map1 = new TreeMap<>();
        map1.put(5,"Rose");
        map1.put(6,"Taj");
        map1.put(7,"Beauty");
        map1.put(8,"India");

        map.putAll(map1);
        for (Map.Entry<Integer,String> l :map.entrySet()) {
            System.out.println(l.getKey()+ " "+ l.getValue());
        }

        System.out.println("The map order is : "+map);
        System.out.println("The map in reverse order : "+map.descendingMap());
        System.out.println("The map key value in reverse order : "+map.descendingKeySet());

        /*System.out.println(" Enter key to search ");
        int key = scanner.nextInt();
        if(map.containsKey(key)){
            System.out.println("Key is present");
        }

        System.out.println("Enter value to search ");
        String value= scanner.next();
        if(map.containsValue(value)){
            System.out.println("Value is present");
        } */

        Set<Integer> set= map.keySet();
        for (Integer k :set ) {
            System.out.print(k+" ");
        }

    }
}
