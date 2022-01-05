package com.full.expect;
import java.util.*;

public class Throw {
    public static void validate(int age)  {
        if(age < 18){
            throw new ArithmeticException("The age is not enough to vote ");
        }
        else{
            System.out.println("Eligible age for vote");
        }
    }
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        int age=input.nextInt();
        Throw.validate(age);
    }
}
