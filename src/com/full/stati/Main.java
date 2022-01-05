package com.full.stati;
import java.util.*;

public class Main {
    static int m,n;    /* static as variable */
    void input() {
        Scanner in= new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
    }
    void Add() {
        int b=m+n;
        System.out.println(b);
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.input();
        main.Add();
    }
}



