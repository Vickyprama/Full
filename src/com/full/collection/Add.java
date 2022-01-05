package com.full.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Add {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(23);
        arrList.add(56);
        arrList.add(32);
        arrList.add(11);
        arrList.add(89);
        System.out.println("The Elements of first list : ");
        System.out.print(arrList +" ");
        System.out.println();

        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(66);
        arrList1.add(98);
        arrList1.add(9);
        arrList1.add(111);
        arrList1.add(90);
        System.out.println("The Elements of second  list : ");
        System.out.print(arrList1 +" ");
        System.out.println();

        arrList.addAll(arrList1);                                                     // addAll is used to add all elements in Arraylist
        System.out.println("After adding  elements of first list : ");
        System.out.print(arrList +" ");
        System.out.println();

        Collections.sort(arrList);
        System.out.println("After sorting   elements of first list : ");
        System.out.print(arrList +" ");
        System.out.println();

        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.add(787);
        arrList2.add(984);
        arrList2.add(943);
        arrList2.add(116);
        arrList2.add(976);

        arrList.addAll(3, arrList2);                       // we can add all list elements in particular index of another list
        System.out.println();
        System.out.println("After adding   elements of first list : ");
        System.out.print(arrList +" ");
    }
}
