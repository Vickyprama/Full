package com.full.expect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter number : ");
            int number1 = input.nextInt();
            System.out.println("Enter number : ");
            int number2 = input.nextInt();                         // we can create multiple catch method for try
            int number3 = number1 / number2;
            System.out.println(number3);
        } catch (InputMismatchException mistake) { //// if we give alphabet  to second number then it gives InputMismatchException
            System.out.println("You enter alphabet  so enter correct input");
        } catch (ArithmeticException mistake) {
            System.out.println("You enter zero  so give correct input");
        }
    }
}
