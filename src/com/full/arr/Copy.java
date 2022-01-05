package com.full.arr;

import java.sql.SQLOutput;

public class Copy {
    public static void main(String[] args) {
        /* char  arr[]={'d','t','k','i','e','p','q'};
        for (char  i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        char[] k =new char[4];
        System.arraycopy(arr,3,k,0,4);
        System.out.println(String.copyValueOf(k));       /* arraycopy is only applicable to char array because copyValueof shows only char array */

        int arr[]={6,1,2,3,46,9,5};
        int arr1[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        for (int k: arr1) {
            System.out.println(k);
        }
    }
}
