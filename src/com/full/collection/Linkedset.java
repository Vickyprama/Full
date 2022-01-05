package com.full.collection;
import java.util.*;

//linkedhashset follows insertion order and  similar to hashset and treeset


public class Linkedset {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Z");
        set.add("PQ");
        set.add("N");
        set.add("O");
        set.add("KK");
        set.add("FGH");
        System.out.println(set);
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(99);
        set1.add(7);
        set1.add(0);
        set1.add(67);
        set1.add(89);
        set1.add(66);
        System.out.println(set1);
    }
}

