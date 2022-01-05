package com.full.collection;

import java.util.ArrayList;

public class Method {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Arun");
        names.add("Karthi");
        names.add("Sathish");
        names.add("Kavi");
        names.add("Mani");
        System.out.println("The list of names : ");
        System.out.print(names+" ");
        System.out.println();                        // we can get required element in the Arraylist
        String name= names.get(2);
        System.out.println("The name of person is : " + name);
        names.clear();
        System.out.println(names);                    // using clear all the elements are cleared



    }
}
