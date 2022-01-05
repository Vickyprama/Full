package com.full.abst;

public class Wrapper {
    public static void main(String[] args) {
        int a=100;                          /* here data type is assigned */
        System.out.println(a);
        Integer obj=a;                      /* the int data type is convered into Integer object */
        System.out.println(obj);
        Integer obj1= 65;                   /* Integer object is created */
        System.out.println(obj1);
        int n=obj1;                         /* the Object is convered into data type */
        System.out.println(n);
    }
}
