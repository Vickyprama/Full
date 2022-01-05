package com.full.expect;
import java.util.*;
      // the finally block is executed all time whether try block and catch run or not but finally block is executed
public class Finally {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       try{
           System.out.println("Enter value 1 : ");
           int number1 = input.nextInt();
           System.out.println("Enter value 2 : ");
           int number2 = input.nextInt();
           int number3 = number1 / number2;
           System.out.println("The value is : "+number3);
       }
       catch(Exception mistake){
           System.out.println("Enter correct input");
       }                                                    // we can use one finally block for one try block
       finally {
           System.out.println("The process is over ");
       }
    }
}
