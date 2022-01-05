package com.full.arr;
import java.util.*;

public class Twolar {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int m=Integer.MIN_VALUE;
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(m < array[i]){
                m2=m1;
                m1=m;
                m=array[i];
            }
            if(m < array[i] && m1 >array[i]){
                m1=array[i];
            }
            if(m < array[i] && m1< array[i] && m2 >array[i]){
                m2=array[i];
            }
        }
        System.out.println("Third largest value is : "+m2);

        int num=Integer.MAX_VALUE;
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(num > array[i]){
                num2=num1;
                num1=num;
                num=array[i];
            }
            if(num < array[i] && array[i] < num1){
                num1=array[i];
            }
            if(num < array[i] && num1<array[i] && array[i] < num2){
                num2=array[i];
            }

        }
        System.out.println("The third Smallest number : "+num2);
    }
}
