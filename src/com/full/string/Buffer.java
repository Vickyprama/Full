package com.full.string;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");                              // append() is used to add string at end
        System.out.println(sb);

        StringBuffer sb1 =new StringBuffer("Hello ");
        sb1.insert(1,"Java");                   //insert() is used to insert string to particular place
        System.out.println(sb1);

        StringBuffer sb2 =new StringBuffer("Hello");
        sb2.replace(1,3,"Java");               //replace() is used to replace given range words
        System.out.println(sb2);

        StringBuffer sb3 =new StringBuffer("Hello");
        sb3.delete(1,3);                                     //delete() is used to delete give range valuse
        System.out.println(sb3);

        StringBuffer sb4 =new StringBuffer("Hello");
        sb4.reverse();                                         //reverse() used to reverse the string
        System.out.println(sb4);

        StringBuffer sb5=new StringBuffer();
        System.out.println(sb.capacity());                          //default 22
        sb.append("Hello");
        System.out.println(sb.capacity());                           //now 22
        sb.append("java is my favourite language");                  // now capacity is increse because exceed its range new is ((old range*2)+2
        System.out.println(sb.capacity());
    }
}
