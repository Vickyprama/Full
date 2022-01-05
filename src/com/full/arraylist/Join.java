package com.full.arraylist;

import com.full.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Join {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println(list2);                      // we can join two array list in one array list
        Collections.sort(list2);
        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>() ;
        list3 = (ArrayList<Integer>) list2.clone();                 // we can clone the arraylist
        System.out.println(list3);

        list3.clear();
        System.out.println(list3);                               //we can clear the arraylist and we can use remove all to delete all elements
    }
}
