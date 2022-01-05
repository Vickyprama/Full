package com.full.expect;

public class Nested {
    public static void main(String[] args) {
        try{
            int array[]={5,8,9,0,8};
            System.out.println(array[4]); // nested if is we can use try block inside other try block
            try{
                int number = array[2]/0;
            }
            catch (ArithmeticException mistake){
                System.out.println("Division by zero is not possible ");
            }
            catch(ArrayIndexOutOfBoundsException mistake){
                System.out.println("The number not exist");
            }
        }
        catch(ArrayIndexOutOfBoundsException mistake){
            System.out.println("The number does not exist");
        }
    }
}
