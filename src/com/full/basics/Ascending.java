package com.full.basics;
import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean decision = true;
        int size= input.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    decision=false;
                    break;
                }
            }
        }

        if(decision==true){
            System.out.println("In ascending order");
        }
        else{
            System.out.println("not in ascending order ");
        }
    }
}
