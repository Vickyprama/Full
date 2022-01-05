package com.full.linked;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Kumar");
        list.add("Kavi");
        list.add("Sathish");
        list.add("Kumar");
        list.add("Mani");

        list.addFirst("Arun");                  // adding elements in first
        list.addLast("Kandan");                 // adding elements in last
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();
        list.removeFirst();
        System.out.println("List after removing element ");
        Iterator<String> iter1 = list.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
    }
}
