package com.full.arr;
import java.util.*;

public class Sort1 {
    public static void main(String[] args) {
        int temp=0;
        int arr[]={7,9,17,8,5,7,3,1};
        Arrays.sort(arr);
        System.out.print("Sorted array : "+"\n");
        for (int k:arr) {
            System.out.print(k+" ");
        }
        System.out.println();
        int n=arr[arr.length-1] - arr[0];
        System.out.print("The length of new array is : "+n);
        int q=arr[0];
        int o=arr[arr.length-1];
        int arr1[]= new int[n+1];
        for (int i =0; i <=n; i++) {
            int j=i+q;
            arr1[i]=j;
        }
        System.out.println();
        for (int k1:arr1) {
            System.out.print(k1+" ");
        }
    }
}
