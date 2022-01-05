package com.full.stream;

import java.util.*;

import java.util.stream.*;
public class Example {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, p -> p+1).limit(10).collect(Collectors.toList());
        System.out.println(list);


        List<Integer> list1 =  Stream.generate(() -> (new Random()).nextInt(100)).limit(30).collect(Collectors.toList());
        System.out.println(list1);

    }
}
