package com.full.arr;
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int sum;
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[][] = new int[n][m];                    /* the array size is defined by the user */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        int n1 =in.nextInt();
        int m1 =in.nextInt();
        int arr1[][] = new int[n1][m1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=in.nextInt();
            }
        }

        int n2 =in.nextInt();
        int m2 =in.nextInt();
        int c[][] = new int[n2][m2];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                sum=0;
                for (int k = 0; k < c[j].length; k++) {
                    sum += arr[i][k] + arr[k][j];
                }
                c[i][j]=sum;
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
