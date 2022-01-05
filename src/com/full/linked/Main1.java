package com.full.linked;

import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Violet");
        list.add("Pink");
        list.add("Green");
        System.out.println(list);

        list.set(2,"Orange");
        list.add(1,"Violet");


        list.addFirst("Sky blue");
        list.addLast("Brown");


        System.out.println("Iteration starts : ");
        Iterator iter = list.iterator();                         // iterate all elements
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

        System.out.println();
        System.out.println("Iteration start from specified place : ");
        Iterator iter1 = list.listIterator(1);          // we can start from specified index
        while(iter1.hasNext()){
            System.out.print(iter1.next()+" ");
        }
        System.out.println();

        System.out.println("Descending order");
        Iterator iter2 = list.descendingIterator();
        while(iter2.hasNext()){
            System.out.print(iter2.next() +" ");
        }
    }
}
