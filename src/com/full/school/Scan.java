package com.full.school;


import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        byte b=in.nextByte();
        short c=in.nextShort();
        float d=in.nextFloat();
        System.out.println(in.hasNextLong());
        long e=in.nextLong();
        double f=in.nextDouble();
        char g=in.next().charAt(0);
        System.out.println("Int "+a);
        System.out.println("Byte "+b);
        System.out.println("Short "+c);
        System.out.println("Float "+d);
        System.out.println("Long  "+e);
        System.out.println("Double"+f);
        System.out.println("Char "+g);
    }
}
