package com.full.expect;
import java.io.IOException;
import java.util.*;

public class Throws {
    static void details(String name, String password) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user Name : ");
        String userName=input.next();
        System.out.println("Enter user Password : ");
        String userPassword=input.next();
        if((userName.equals(name)) && (userPassword.equals(password))){
            System.out.println("Logged in sucessfully");
        }
        else{
            throw new IOException("Logged in failed and please enter correct password");
        }
    }

    public static void main(String[] args) throws IOException {
        String name = "Prama";
        String password="Hello@";
        details(name,password);
    }
}
