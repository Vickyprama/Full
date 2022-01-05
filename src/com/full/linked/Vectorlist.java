package com.full.linked;
import java.util.*;

public class Vectorlist {
    public static void main(String args[]) {
        Vector<String> vec = new Vector<String>(2);
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");
        vec.add("Fig");

        System.out.println("Size is: "+vec.size());                             // check size and capacityIncrement
        System.out.println("Default capacity increment is: "+vec.capacity());

        vec.add("fruit1");
        vec.add("fruit2");
        vec.add("fruit3");

        System.out.println("Size after addition: "+vec.size());              //size and capacityIncrement after three insertions
        System.out.println("Capacity after increment is: "+vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }
}
