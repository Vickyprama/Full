package com.full.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("how");
        list.add("okkk");
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.add("oiii");
        System.out.println(list1);                  // we can copy all elements in new arraylist


        System.out.println("Before shuffle "+list);         // we can shuffle the arraylist
        Collections.shuffle(list);
        System.out.println("after shuffle "+list);

        Collections.reverse(list);                              // we can reverse the list elements
        System.out.println(list);

        System.out.println(list.subList(0,2));                      // we can create sub arraylist

        ArrayList<String> list2= new ArrayList<>();
        for (String k :list) {
            System.out.println( list2.add(list1.contains(k) ? "Yes" : "No"));
        }


        Collections.swap(list,0,2);                               // we can swap elements between index inarraylist
        System.out.println(list);
    }
}
