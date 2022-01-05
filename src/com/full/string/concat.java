package com.full.string;

public class concat{
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Tendulkar";  /* + is converted into String s3=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  */
        String s3=s1 +s2;
        System.out.println(s3);
        System.out.println(s1.concat(s2));
        System.out.println(String.join("",s1,s2));   /* we can concat string using join */
    }
}
