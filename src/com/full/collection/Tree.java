package com.full.collection;
import java.util.*;

public class Tree {
    public static void main(String args[]) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("The entry of Map is : ");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(102);
        System.out.println("After removing one entry : ");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("headMap: "+map.headMap(102));

        System.out.println("tailMap: "+map.tailMap(102));

        System.out.println("subMap: "+map.subMap(100, 102));
    }
}
