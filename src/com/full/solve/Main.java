package com.full.solve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n1= -5;
         int n2=12;
         int count=0,sum=0;
         double result;
         if(n1%3==0 || n2 %3==0){
             for (int i = n1; i <=n2 ; i++) {
                 if(i%3==0){
                     count++;
                     sum += i;
                 }
             }
         }
         result=sum/count;
        System.out.println(result);

         /*int n3= input.nextInt();
         if(n1 <= n2 && n2<=n3){
             System.out.println("true");
         }
         else if(n1 >= n2 && n2 >= n3){
             System.out.println("True");
         }
         else{
             System.out.println("false");
         }*/


    }
}
