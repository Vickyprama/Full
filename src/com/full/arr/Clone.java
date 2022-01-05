package com.full.arr;
public class Clone {
    public static void main(String[] args) {
        int arr[]={3,4,6,7,9,9,7,4};
        for (int n:arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        int arr1[]=arr.clone();
        for (int j:arr1) {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.print(arr1==arr);  /* it returns false because it create new object or memory is different */

    }
}
