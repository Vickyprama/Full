package com.full.arr;

public class Pass {
    static void max(int  arr[]) {               /* passing a array in method */
        int min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr1[]={33,3,6,7};
        max(arr1);
    }

}
