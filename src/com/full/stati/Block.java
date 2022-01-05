package com.full.stati;

public class Block {
    static{   /* static block execute before main method */
        System.out.println("Hello How are u?");
    }
    void display(){
        System.out.println("oiii");
    }

    public static void main(String[] args) {
        Block block=new Block();
        block.display();
    }
}
