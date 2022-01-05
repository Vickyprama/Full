package com.full.arr;
import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,4,5};
        int n=in.nextInt();      // number of rotation
        for (int i = 0; i <n; i++) {
            int j,first;
            first=arr[0];
            for ( j= 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("After  left rotation ");
        for(int y:arr){
            System.out.print(y+" ");
        }
        System.out.println();
        for (int i = 0; i <n; i++) {
            int last=arr1[arr1.length-1];
            int j;
            for ( j =arr1.length-1; j > 0; j--) {
                arr1[j]=arr1[j-1];
            }
            arr1[j]=last;
        }
        System.out.println("After right rotation");
        for (int k:arr1) {
            System.out.print(k+" ");
        }
    }
}
