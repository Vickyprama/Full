package com.full.linked;
import java.util.*;

public class Push {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Kumar");
        list.add("Kavi");
        list.add("Sathish");
        list.add("Kumar");
        list.add("Mani");
        System.out.println("The elements of list : "+list);
        System.out.println();

        list.push("Arun ");                                  //push is used to add elements in first
        System.out.println("The elements of list : "+list);

        System.out.println();
        list.pop();                                              // pop is used to delete elements in first
        System.out.println("The elements of list : "+list);

        System.out.println();
        System.out.println("The first element in list : "+list.peek());   // peek is used to return first value and does not remove
        System.out.println();
        System.out.println("The elements of list : "+list);

        System.out.println();
        System.out.println("The first element in list : "+list.peekFirst());     // peek is used to return first value and does not remove
        System.out.println();
        System.out.println("The elements of list : "+list);

        System.out.println();
        System.out.println("The last element of list is : "+list.peekLast());   // peek is used to return last value and does not remove
        System.out.println();
        System.out.println("The elements of list : "+list);


        System.out.println();
        list.poll();                                             //poll is used to remove head of list
        System.out.println("The elements of list : "+list);

        System.out.println();
        list.pollFirst();                                           // pollFirst is used to remove first element
        System.out.println("The elements of list : "+list);

        System.out.println();
        list.pollLast();                                              //pollLast is used to remove last element
        System.out.println("The elements of list : "+list);
    }
}
