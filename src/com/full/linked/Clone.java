package com.full.linked;
import java.util.*;

public class Clone {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(67);
        list.add(88);
        list.add(54);
        list.add(92);
        list.add(87);
        System.out.println("Enter elements of first list ");
        System.out.println(list);
        System.out.println();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1=(LinkedList)list.clone();
        System.out.println("Enter the elements of second list ");
        System.out.println(list1);
        System.out.println();

        Collections.sort(list,Collections.reverseOrder());
        for (Integer num: list) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Elements in descending order");
        Iterator iter = list1.descendingIterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}

