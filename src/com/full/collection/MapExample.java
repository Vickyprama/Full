package com.full.collection;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        System.out.println(map);                                  //three views of map
        Collection list =  map.values();
        System.out.println(list);

        Set set = map.entrySet();
        System.out.println(set);                                  //  Map.Entry Entry is the sub interface so it has separate methods
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
