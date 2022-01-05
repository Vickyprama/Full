package com.full.collection;
import java.util.*;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Arun");
        names.add("Karthi");
        names.add("Sathish");                       //we can add
        names.add("Kavi");
        names.add("Mani");
        System.out.println("The list of names : ");
        System.out.print(names+" ");
        System.out.println();
        System.out.println("After adding names : ");

        names.add(3,"Kumar");
        names.add(5,"Bharathi");                              // we can using index

        System.out.print(names+" ");
        System.out.println();
        System.out.println("After changing names : ");

        names.set(1,"Kumar");                                            // we can change element karthi to kumar
        System.out.print(names+" ");

        names.remove("Mani");
        System.out.println();
        System.out.println("After removing  names : ");
        System.out.print(names+" ");                                        // we can remove using index or using object


        System.out.println();
        for (String list: names) {                                          // Iterating in Arraylist
            System.out.print(list+" ");
        }


        System.out.println();
        Collections.sort(names);                                            //sorting in Arraylist
        System.out.println("After sorting elements are : ");
        System.out.print(names+" ");
        System.out.println();


        System.out.println("Sorting in reverse order ");
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);


        System.out.println();                                                 // we can get size of list
        System.out.println("The size of list is : ");
        System.out.println(names.size());
    }
}
