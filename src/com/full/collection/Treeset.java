package com.full.collection;
import java.util.*;

// tree set is similar to hash set but tree set follow ascending order
// we can give any order but it gives ascending  order

public class Treeset {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("ABC");
        set.add("String");
        set.add("Test");
        set.add("Pen");
        set.add("Ink");
        set.add("Jack");
        System.out.println(set);
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        set1.add(88);
        set1.add(7);
        set1.add(101);
        set1.add(0);
        set1.add(3);
        set1.add(222);
        System.out.println(set1);
    }
}

