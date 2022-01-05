package com.full.expect;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter number : ");
            int number1 = input.nextInt();
            System.out.println("Enter number : ");
            int number2 = input.nextInt();
            int number3 = number1 / number2;
            System.out.println(number3);    // if we give zero to second number then it gives ArithmeticException
        }
       catch(ArithmeticException e){
            System.out.println("You enter zero  so give correct input");
        }
    }
}
