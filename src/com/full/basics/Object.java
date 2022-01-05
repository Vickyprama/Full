package com.full.basics;

public class Object implements  Print {
    public void scan() {
        System.out.println("Scannable object ");
    }

    public void printable() {
        System.out.println("Printable objects ");
    }

    public static void main(String[] args) {
        Object object = new Object();
        object. scan();
        object.printable();
    }

}
