package com.full.string;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";                  /*  compiler create object for string with literal hello in string comstant pool */
        System.out.println(s1 + " " + s2);
        String s3 = new String("welcome");
        String s4 = new String("welcome");
        System.out.println(s3);
        System.out.println(s4);                 /* with new keyword it create two object */
    }
}
