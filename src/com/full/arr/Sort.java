package com.full.arr;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int temp = 0;
        int arr[]={5,2,8,7,9,1,3,4,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("The ascending order : ");
        for (int k:arr) {                                           // ascending order
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("The descending order : ");
        for (int i =arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}

