package com.full.arr;

public class Different {
    public static void main(String[] args) {
        byte arr[]={1,2,3,4,8};
        System.out.println("Byte array");
        for (byte a: arr) {
            System.out.print( a +" ");
        }
        System.out.println();
        int arr1[]={1,2,3,4,8};
        System.out.println("Int array");
        for (int a: arr1) {
            System.out.print( a +" ");
        }
        System.out.println();
        System.out.println("Short  array");
        short arr2[]={1,2,3,4,8};
        for (short  a: arr2) {
            System.out.print( a +" ");
        }
        System.out.println();
        long arr3[]={1,2,3,4,8};
        System.out.println("Long array");
        for (long a: arr3) {
            System.out.print( a +" ");
        }
        System.out.println();
        float arr4[]={1.7f,2.8f,3.7f,4.3f,8.2f};
        System.out.println("Float array");
        for (float a: arr4) {
            System.out.print( a +" ");
        }
        System.out.println();
        double arr5[]={1.7,2.89,3.709,4.308,8.232};
        System.out.println("Double array");
        for (double a: arr4) {
            System.out.print( a +" ");
        }
        System.out.println();
        char arr6[]={'w','e','r','y','w','j'};
        System.out.println("Char array");
        for (char a: arr6) {
            System.out.print(a+" ");
        }
        System.out.println();
        String arr7[]={"hii","oiii","liii"};
        System.out.println("String array");
        for (String a: arr7) {
            System.out.print(a+" ");
        }
    }
}
