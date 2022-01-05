package com.full.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int max,min;
        System.out.println("Enter array length : ");
        int n= in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();
        }
        /* max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max=array[i];                               //without sorting largest number
            }

        }
        System.out.println("The largest element is : "+max); */
        Arrays.sort(array);
        System.out.println("The largest element is : "+array[array.length-1]);
        System.out.println("The smallest element is : "+array[0]);
        min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];                               //without sorting smallest  number
            }
        }
        System.out.println("The smallest element is : "+min);
    }
}
