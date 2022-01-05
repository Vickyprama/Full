package com.full.string;
// String buider same as String buffer except synchronization
public class Builder {
    public static void main(String[] args) {
        StringBuilder sb[]= new StringBuilder[5];
        //sb[0]=sb.append("Java");                              // append() is used to add string at end
        System.out.println(sb);

        StringBuilder sb1 =new StringBuilder("Hello ");
        sb1.insert(1,"Java");                   //insert() is used to insert string to particular place
        System.out.println(sb1);

        StringBuilder sb2 =new StringBuilder("Hello");
        sb2.replace(1,3,"Java");               //replace() is used to replace given range words
        System.out.println(sb2);

        StringBuilder sb3 =new StringBuilder("Hello");
        sb3.delete(1,3);                                     //delete() is used to delete give range valuse
        System.out.println(sb3);

        StringBuilder sb4 =new StringBuilder("Hello");
        sb4.reverse();                                         //reverse() used to reverse the string
        System.out.println(sb4);

       /* StringBuilder sb5=new StringBuilder();
        System.out.println(sb.capacity());                          //default 22
        sb.append("Hello");
        System.out.println(sb.capacity());                           //now 22
        sb.append("java is my favourite language");                  // now capacity is increse because exceed its range new is ((old range*2)+2
        System.out.println(sb.capacity()); */
    }
}
