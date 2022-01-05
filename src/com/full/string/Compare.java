package com.full.string;

public class Compare {
    public static void main(String[] args) {
        String a="Oiii";
        String b= "Oiii";
        String c= new String("Oiii");
        String d="Oiiiiii";
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));            /* comparision using equals */
        System.out.println(c.equals(d));
        System.out.println(a==b);
        System.out.println(b==c);           /* it returns false because c creates new object */

        String s1="Sachin";
        String s2="Sachin";
        String s3="Sachinm";         /* s1==s2 :The method returns 0.s1>s2 :The method returns a positive value.s1<s2 :The method returns a negative value.*/
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));

        String r="viratl";
        String r1="VIRATl";
        System.out.println(r.equalsIgnoreCase(r1));
        System.out.println(r.compareToIgnoreCase(r1));

    }
}
