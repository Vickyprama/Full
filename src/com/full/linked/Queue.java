package com.full.linked;
import java.util.*;

public class Queue {
    public static void main(String[] args) {
       PriorityQueue<String> queue  = new PriorityQueue<>();
       queue.add("Black");
       queue.add("White");
       queue.add("Pink");
       queue.add("Violet");
       System.out.println(queue);

        for (String k:queue) {
            System.out.println(k);
        }
        PriorityQueue<String> queue1  = new PriorityQueue<>();
        queue1.add("lack");
        queue1.add("Whe");
        queue1.add("Pin");
        queue1.add("Violet");

        for (String element :queue) {
            System.out.println(queue1.contains(element));
        }


        String n ;
        n=queue.toString();
        System.out.println("String representation : "+n);

        queue.offer("Orange");
        System.out.println(queue);

        queue.offer("Rose");
        System.out.println(queue);

        String val =null;
        while((val = queue.poll()) != null){
            System.out.print(val+" ");
        }

    }
}
