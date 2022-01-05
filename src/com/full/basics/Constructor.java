package com.full.basics;

import java.util.Scanner;

public class Constructor {
    private Constructor(){                                      // constructor with no arguments
        System.out.println("hello");
    }

    Constructor(int a,int b){                           // constructor with arguments
        int c= a+b;
        System.out.println("The value of c is : "+c);
    }

    Constructor(int a,int b,int c){
        int d= a+b+c;
        System.out.println("The value of d is : "+d);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Constructor obj = new Constructor();
        System.out.println("Enter two numbers : ");
        Constructor obj1 = new Constructor(input.nextInt(),input.nextInt());
        System.out.println("Enter three  numbers : ");
        Constructor obj2 = new Constructor(input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("Hello");
    }
}



