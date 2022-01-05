package com.full.arr;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};                    /* array is declare and initializes*/
        for(int i=0;i<arr.length;i++) {             /* using for loop print elemenys in array */
            System.out.print(arr[i]+" ");
        }
        int arr1[]=new int[5];
        arr1[0]=19;
        arr1[1]=87;
        arr1[2]=76;
        arr1[3]=98;
        arr1[4]=11;
        for (int h:arr1) {
            System.out.println(h);
        }
        System.out.println(arr[3]);

    }
}
