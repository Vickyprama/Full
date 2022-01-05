package com.full.linked;

import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put( "Red",1);
        map.put( "Green",2);
        map.put( "Black",3);
        map.put( "White",4);
        map.put( "Blue",5);
        System.out.println("The original elements  is : "+map);
        System.out.println("1. if key 'Green' is exits ?  ");
        if(map.containsKey("Green")){
            System.out.println("Yes - exists and its values are "+map.get("Green"));
        }
        else{
            System.out.println(" Not exists ");
        }
        if(map.containsValue(3)){
            System.out.println("Yes - exists ");
        }
        else{
            System.out.println(" Not exists ");
        }
    }
}
