package com.full.linked;

import com.full.collection.Arraylist;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Rose");
        list.add("White");

        System.out.println(list);

        for (String k: list) {
            System.out.print(k+" ");
        }


        System.out.println();
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        String array[] = new String[list.size()];
        list.toArray(array);                                        // set tpo array
        for (String k :array) {
            System.out.print(k+" ");
        }
        System.out.println();


        System.out.println("The Tree set elements are");                // hashset to tree set
        TreeSet<String> set = new TreeSet<>(list);
        for (String k :set) {
            System.out.print(k+" ");
        }
        System.out.println();


        System.out.println("The List   elements are");                // hashset to list
        List<String> arraylist = new ArrayList<>(list);
        for (String k : arraylist) {
            System.out.print(k+" ");
        }
    }
}
