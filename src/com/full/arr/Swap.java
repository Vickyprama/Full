package com.full.arr;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         /*  int size = in.nextInt();
        int first[] = new int[size];
        int sec[] = new int[size];
        System.out.println("Enter first elements  : ");
        for ( int i= 0 ; i < size ; i++ )
        {
            first[i] = in.nextInt();
        }
        System.out.println("Enter second  elements : ");
        for ( int i= 0 ; i < size ; i++ )
        {
            sec[i]=in.nextInt();
        } */
        int first[]={10,15,13,18,19};
        int sec[]={16,89,92,76,80};
        int size=first.length;
        int size1=sec.length;
        if(size == size1) {
        for (int i = 0; i < size; i++) {
                first[i] = first[i] + sec[i];
                sec[i] = first[i] - sec[i];
                first[i] = first[i] - sec[i];
            }
            System.out.println("First array elements after swap : ");
            for (int i = 0; i < size; i++) {
                System.out.print(first[i] + " ");
            }
            System.out.println();
            System.out.println("Second array  elements after swap : ");
            for (int i = 0; i < size; i++) {
                System.out.print(sec[i] + " ");
            }
        }
        /* int num =in.nextInt();
        first[num] = first[num] + sec[num];
        sec[num] = first[num] - sec[num];
        first[num] = first[num] - sec[num];
        System.out.println("First array elements after swap : ");
        for (int i = 0; i < size; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        System.out.println("Second array  elements after swap : ");
        for (int i = 0; i < size; i++) {
            System.out.print(sec[i] + " ");*/

    }
}
