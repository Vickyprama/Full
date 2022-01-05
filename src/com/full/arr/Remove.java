package com.full.arr;
import java.util.Arrays;
import java.util.Scanner;

public class Remove {
    public static int get(int[] arr,int n){
        int temp[] =new int[n];
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int length;
        int array[] ={2,3,1,5,6,4,3,2,1};
        int len = array.length;
        Arrays.sort(array);
        length=get(array,len);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

