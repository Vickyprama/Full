package com.full.arr;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n= in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();
        }
        /*    System.out.println("Duplicate elements : ");
        for (int i = 0; i < array.length; i++) {               //Duplicate element in array
            for (int j =i+1; j < array.length ; j++) {
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                }
            }
        } */
      /*  for (int i =array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] +" ");                       //reverse
        } */
        System.out.println("The even elements are : ");
        for (int i = 0; i < array.length; i=i+2) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("The odd  elements are : ");
        for (int i = 1; i < array.length; i=i+2) {
            System.out.print(array[i]+" ");
        }
    }
}
