package com.full.stati;
import java.util.*;
public class Method {
     static void display() {
         System.out.println("hii friends");
    }
    static void loco(){
         display();
    }
     void print() {     /* to call we need object */
        display();
    }

    public static void main(String[] args) {
         Method method = new Method();
         method.print();
        Method.display();
        Method.loco();
    }
}
