package com.full.arr;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();                         /* we have to give array length */
        int arr[]= new int[n];                      /* declare array with given length */
        for(int i=0;i<arr.length;i++){              /*  using for loop we give input to individual index */
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){              /* using for we get individual index value and print */
            System.out.print(arr[i]+" ");
        }
        for(int i :arr){                             /* for each loop it holds array elements in a variable  */
            System.out.print(i +" ");
        }
    }
}
