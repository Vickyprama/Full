package com.full.basics;
import java.util.*;


abstract class Money{
    abstract void  debit();
    abstract void password();
    private int pin;
    void set(int num){

        this.pin=num;
    }
    int get(){
        return pin;
    }
}
public class Bank extends Money {
    Scanner scanner= new Scanner(System.in);
    void debit() {
            System.out.println("enter pin number to proceed ");
            set(scanner.nextInt());
            System.out.println("Password is correct "+get());
            System.out.println("Enter amount ");
            System.out.println("Close the process ");
    }
    void password () {
        System.out.println("Enter password change option ");
        set(scanner.nextInt());
        System.out.println("Password changed as  "+get());
        System.out.println("Close the process ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        bank.debit();
        System.out.println("If you want to change password enter 1");
        int num = input.nextInt();
        if(num == 1) {
            bank.password();
        }
        else{
            System.out.println("thank you ");
        }
    }

}
