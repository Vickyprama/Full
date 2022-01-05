package com.full.collection;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Orange");
        set.add("Fig");
        set.add("Apple");               // it does not allow duplicate value so in compiler it does not exist
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        System.out.println();
        String array[] = new String[set.size()];
        set.toArray(array);                                  // we can convert hashset into array
        System.out.println("Array elements: ");
        for (String temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println(array[0]);

        System.out.println();
        set.clear();                    // clear is used to delete all elements
        System.out.print(set);
    }
}
