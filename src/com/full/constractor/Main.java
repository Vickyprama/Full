package com.full.constractor;

public class Main {
    Main(){
        System.out.println("Hello");
    }
    protected Main(int a){
        System.out.println(a);
    }
    public  Main(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Main main=new Main();
        Main main1=new Main(5);
        Main main2= new Main(5,7);
        System.out.println("friends");
    }
}

