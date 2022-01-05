package com.full.riding;

public class Main1 {
    void add(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Main1 main=new Main1();
        Human human= new Human();
        main.add(5,5);
        human.add(6,6);
    }
}
