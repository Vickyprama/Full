package com.full.basics;
import java.util.*;


public class Inter implements Sbi, Sbi.mes {
    public void debit(){
        System.out.println("enter pin number to proceed ");
        System.out.println("Password is correct ");
        System.out.println("Enter amount ");
        System.out.println("Close the process ");
    }
    public void password(){
        System.out.println("Enter password change option ");
        System.out.println("Password changed as  ");
        System.out.println("Close the process ");
    }
    public  void print(){
        System.out.println("Hi  world     ");
    }

    public static void main(String[] args) {
        Inter inter = new Inter();
        Sbi sbi = new Inter();
        inter.debit();
        inter.password();
        inter.print();
        Sbi.voice();
        sbi.dance();
    }
}

