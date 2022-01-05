package com.full.collection;
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.offer("Rahul");
        System.out.println("head:"+queue.element());    // element return head of queue
        System.out.println("head:"+queue.peek());                   // peek return head of queue
        queue.poll();                                                // poll remove head
        System.out.println("After removing head:"+queue.element());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
