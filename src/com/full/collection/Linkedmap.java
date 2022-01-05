package com.full.collection;

import java.util.*;


public class Linkedmap {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
        System.out.println("Initial list of elements: "+ map);
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.putIfAbsent(103, "Gaurav");
        System.out.println("After adding entry : ");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map1 =new HashMap<Integer,String>();
        map1.put(104,"Ravi");
        map1.putAll(map);
        System.out.println("After adding other map entry   ");
        for(Map.Entry m: map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
    }
}
