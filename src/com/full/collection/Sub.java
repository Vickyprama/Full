package com.full.collection;

import java.util.ArrayList;

public class Sub {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(23);
        arrList.add(56);
        arrList.add(32);
        arrList.add(6754);
        arrList.add(89);
        arrList.add(6754);
        System.out.println("The Elements of first list : ");
        System.out.print(arrList +" ");
        System.out.println();

        ArrayList<Integer> arrList1 = new ArrayList<>(arrList.subList(2,4));
        System.out.println("The Elements of  sublist : ");
        System.out.print(arrList1 +" ");
        System.out.println();
    //if we have duplicate element to find place of last occurance of duplicate number we use lastIndex(6754 repeat twice it returs last time index
        System.out.println("The last occurance of object 6754 is : "+arrList.lastIndexOf(6754));

        System.out.println(); // contains check whether element is present or not
        System.out.println("The element 32 is present in array list :" + arrList.contains(32));
    }
}
