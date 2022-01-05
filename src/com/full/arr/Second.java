package com.full.arr;

public class Second {
    public static void main(String[] args) {
        int arr[]={9,6,7,-1,88,1,7,23};
        int small=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small){
                second=small;
                small=arr[i];
            }
            if( arr[i] > small && arr[i] < second ){
                second=arr[i];
            }
        }
        System.out.println(second);
        System.out.println(small);
    }
}
