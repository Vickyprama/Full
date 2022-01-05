package com.full.arr;
import java.util.*;

public class Additional {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /* int n= in.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all numbers : "+sum);  */
        System.out.println("Enter a  digit : ");
        int sum,rem;
        int n=in.nextInt();
        int num=n;
        while(num > 9){
            sum=0;
            while(n > 0){
                rem=n%10;
                sum += rem;                 //java program until it become single digit (4444=4+4+4+4=16 >1+6=7)
                n=n/10;
            }
            num=sum;
            n=sum;
        }
        System.out.println(num);

    }
}
