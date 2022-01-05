package com.full.over;

public class Main {
    void Add(int m,int n){
        int j=m+n;
        System.out.println(j);
    }
    void Add(int b,int c,int d){
        int y=b+c+d;
        System.out.println(y);
    }
    public static void main(String[] args){
        Main add=new Main();
        add.Add(5,8);
        add.Add(7,7,7);
    }
}
