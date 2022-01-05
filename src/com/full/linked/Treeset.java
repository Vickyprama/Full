package com.full.linked;

import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Yellow");
        set.add("Blue");
        set.add("Green");
        System.out.println(set);

        System.out.println("Getting elements using iterator ");
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        System.out.println("Using for each loop");
        for (String k:set) {
            System.out.print(k+" ");
        }
        System.out.println();

        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Orange");
        set1.add("Black");
        set1.add("Sandal");
        set1.add("White");

        set.addAll(set1);
        System.out.println(set);

        System.out.println();
        System.out.println("Enter elements in reverse order ");
        Iterator iter1 = set.descendingIterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next()+" ");
        }
    }
}
