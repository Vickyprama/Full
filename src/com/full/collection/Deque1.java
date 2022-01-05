package com.full.collection;
import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("Deque elements ");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();                   //poll last remove last element
        System.out.println("After remove elements ");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
