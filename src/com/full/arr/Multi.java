package com.full.arr;
import java.util.*;
public class Multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int  arr[][]={{1,2},{3,4},{5,4}};
       for(int i=0;i<3;i++){                    /* if we assign valuse to array so we correctly give value for For loop to display */
          for(int j=0;j<2;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
       int n=in.nextInt();
       int m=in.nextInt();
       int arr1[][] = new int[n][m];                    /* the array size is defined by the user */
       for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=in.nextInt();
            }
       }
       for (int i1 = 0; i1 < arr1.length; i1++) {
           for (int j1 = 0; j1 < arr1[i1].length; j1++) {
               System.out.print(arr1[i1][j1] + " ");
           }
           System.out.println();
       }
    }
}
