package com.full.school;

import com.full.string.Array;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        String name = "gvdvvfdwdzzzzvv";
        char variable = 'a';
        int max=0;
        char[] array = name.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            int count = 1;
            for(int j=i+1;j< array.length;j++){
               if( array[i]==array[j] && array[j] != 0 ){
                   count++;
                   array[j]= 0;
               }
               if(max <= count){
                   max=count;
                   variable=array[i];
               }
            }
        }
        System.out.println("highest occurance : " + variable);

    }
}
