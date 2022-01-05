package com.full.stream;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(1,element -> element+1).limit(100).   // iterate infinte numbers
                filter( element -> element%5==0).       // filter is like condition
                //limit(5).                                   // we can srt limit for infi8nte loops
                forEach(System.out::println);                 // foreach for print
    }
}
