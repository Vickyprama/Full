package com.guvi.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*String input = in.nextLine();                       // 2 problem
        System.out.println(input); */

       /* int size = in.nextInt();
        int k = in.nextInt();
        int array[] = new int[size];
        for(int i = 0;i<size;i++){
            array[i]=in.nextInt();                  // 3 problem
        }
        for(int j : array){
            System.out.print(j+" ");
        }   */

        /* String i=in.nextLine();
        String j=in.nextLine();
        String k=in.nextLine();                     // 4 problem
        System.out.println(i);
        System.out.println(j);
        System.out.println(k); */

        /* String n= "Computer";
        char array[]=n.toCharArray();                   //9 problem
        for (char l: array ) {
            System.out.println(l);
        } */

        String k="java";
        k= k.replaceAll(".", "$0"+",");
        k = k.replaceAll(",$", "");
        System.out.print(k);

        /*String n= "Computer";
        char array[]=n.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        String j= String.copyValueOf(array);
        System.out.println(j); */
    }

}
