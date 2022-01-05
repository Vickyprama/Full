package com.full.collection;

import java.util.*;

public class Mapexam {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> list = new LinkedHashMap<>();
        list.put("Vignesh",18);
        list.put("Arumugam",54);
        list.put("Santhi",48);
        list.put("Lakshmi",29);
        Iterator iter = list.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry obj = (Map.Entry) iter.next();
            System.out.println("Name of the person : "+obj.getKey()+ "\n"+"The age of person is : "+obj.getValue());
        }
        System.out.println(list);
        for (Map.Entry<String,Integer> k: list.entrySet()) {
            System.out.println(k.getKey() +" "+k.getValue());
        }
        list.put("Arugam",54);
        System.out.println(list);
        list.remove("Arugam");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
