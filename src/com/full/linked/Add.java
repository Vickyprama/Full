package com.full.linked;

import java.util.Collections;
import java.util.LinkedList;

public class Add {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Rose");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Green");
        list1.add("Blue");
        list.addAll(1,list1);                           // we can add all elements of one list to another list in specified index
        System.out.println(list);

        System.out.println(list.getFirst());                   // we can get first and last element in linked list
        System.out.println(list.getLast());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index position : "+i+" is "+list.get(i));
        }

        list.remove(4);             // we can use removeAll,removeFirsr,removeLast
        System.out.println(list);

        Collections.swap(list,0,2);             // we can swap numbers
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(list.isEmpty());         // empty is used to check list is empty or not
    }
}
