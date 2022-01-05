package com.full.inheritance;

public class Dhoni extends Human {
    public void name(){
        System.out.println("My name is dhoni");
    }
    public void hand(){     /* override hand method */
        System.out.println("I have hand and I am wicket keeper");
    }
    void cricketer(){
        System.out.println("I am Indian cricketer");
    }
}
