package com.full.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(); // creating array list so we can add any number of objects
        arrList.add("john");
        arrList.add("Raju");
        arrList.add("Ram");           //we can add ele3ments using .add
        arrList.add("Pravin");
        Iterator itr = arrList.iterator();
        while (itr.hasNext()){
                System.out.print(itr.next()+" ");
        }
        arrList.remove(2);         // we can delete the element
        System.out.println();
        System.out.println("After removing element : ");
        Iterator itr1 = arrList.iterator();
        while (itr1.hasNext()){
            System.out.print(itr1.next()+" ");
        }
    }
}
