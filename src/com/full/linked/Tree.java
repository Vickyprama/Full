package com.full.linked;

//treeset

import java.util.*;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Yellow");
        set.add("Pink");


        System.out.println(set.first());
        System.out.println(set.last());
        set.pollFirst();
        System.out.println(set);

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("bhnk");
        set1.add("lkh");
        set1.add("Rose");

        TreeSet<String> set2 = new TreeSet<>();
        set2 = (TreeSet<String>) set1.clone();
        System.out.println(set2);
        set2.add("Sky");

        int size = set2.size();
        System.out.println(size );

        TreeSet<String> set3 = new TreeSet<>();
        for (String k : set)
            set3.add(set1.contains(k) ? "Yes " : " No");
        System.out.println(set3);

    }
}
