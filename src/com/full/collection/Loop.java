package com.full.collection;
import java.util.*;
public class Loop {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(14);
        arrList.add(7);
        arrList.add(39);
        arrList.add(40);
        System.out.println("For Loop");                                 //For Loop for iterating ArrayList
        for (int counter = 0; counter < arrList.size(); counter++) {
            System.out.println(arrList.get(counter));
        }
        System.out.println(" For each Loop");                             // For each Loop for iterating ArrayList
        for (Integer num : arrList) {
            System.out.println(num);
        }
        System.out.println("While Loop");                                  // While Loop for iterating ArrayList
        int count = 0;
        while (arrList.size() > count) {
            System.out.println(arrList.get(count));
            count++;
        }
        System.out.println("Iterator");                                     ///*Looping Array List using Iterator*/
        Iterator iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

