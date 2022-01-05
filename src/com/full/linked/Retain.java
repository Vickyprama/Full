package com.full.linked;

import java.util.*;

public class Retain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Yellow");
        set.add("Blue");
        set.add("Green");

        Set<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Black");
        set1.add("Green");
        set1.add("Violet");

        set.retainAll(set1);
        System.out.println(set);
    }
}
