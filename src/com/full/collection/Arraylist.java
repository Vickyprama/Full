package com.full.collection;
import  java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("hello");  // we can add elements with help of function add
        arrList.add("Hi");
        arrList.add(input.next());
        arrList.add(3,"hey");
        arrList.set(1,"how are you");  // we can change the particular element in arrList
        System.out.println(arrList);
    }
}
