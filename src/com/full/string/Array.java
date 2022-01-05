package com.full.string;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        String array[] = new String[]{"jndskfnjl", "kjbsdbfkj", "njkfdn"};
        StringBuffer buffers[] = new StringBuffer[array.length];
        for (int i = 0; i < array.length; i++) {
            buffers[i] = new StringBuffer(array[i]);
        }
        for(StringBuffer h:buffers){
            System.out.println(h);
        }


    }
}