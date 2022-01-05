package com.full.string;

public class Methods {
    public static void main(String[] args) {
        String s="Sachin";
        System.out.println(s.toUpperCase());            //SACHIN
        System.out.println(s.toLowerCase());            //sachin
        System.out.println(s);                          //Sachin(no change in original)

        String s1="  Sachin   ";
        System.out.println(s1.trim());                  //trim() method eliminates white spaces before and after the String.

        String s2="Sachin";
        System.out.println(s2.startsWith("S"));         //this method give true if condition matches or give false
        System.out.println(s2.endsWith("i"));

        String a="Mahendra singh dhoni";
        char e=a.charAt(6);
        System.out.println(e);                           //charAt() gives particular character


        String b="Sachin";
        System.out.println(b.length());                    //length() gives length of string

        int c=10;
        String d=String.valueOf(c);
        System.out.println(d+10);                           //valueof() is used to convert int,float,char array into string
    }
}

