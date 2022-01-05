package com.full.arr;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 2, 2, 5, 8, 9, 1};
        int fr[] = new int[arr.length];
        int visit = -1;
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visit;
                }
            }
            if(fr[i]!=visit){
                fr[i]=count;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visit)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }

}
