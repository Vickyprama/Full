package com.full.expect;
import  java.util.*;

public class Method {
    public static void divide(){   // divide method is called reportedly until correct input is given
        System.out.println("Input for divide method ");
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter the value : ");  //// if we gives alphabet it has mistake so in catch we again call divide method
            int number1 =input.nextInt();
            System.out.println("Enter the value : ");
            int number2 =input.nextInt();                   // if we gives zero it has mistake so in catch we again call divide method
            int number3 = number1 / number2;
            System.out.println("The output is : " + number3);
        }catch (InputMismatchException mistake){
            System.out.println("You enter alphabet  so enter correct input");
            divide();
        }catch (ArithmeticException mistake){
            System.out.println("Entered value is zero"+"\n"+"Please enter correct input : ");
            divide();
        }catch(Exception mistake){
            System.out.println("Unexpected mistake so please enter input ");
            divide();
        }
    }
    public static void add(){
        System.out.println("Input for adding method : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int number1 =input.nextInt();
        System.out.println("Enter the value : ");
        int number2 =input.nextInt();
        int number3 = number1 + number2;
        System.out.println("The output is : "+ number3);
    }

    public static void main(String[] args) {
        Method method = new Method();
        divide();
        method.add();
    }
}
