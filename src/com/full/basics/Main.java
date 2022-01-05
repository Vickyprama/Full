package com.full.basics;
import java.util.*;

abstract class Bike {
    Bike(){                                                         // abstruct class have constructor it call by JVM
        System.out.println("New world");
    }
    abstract void  run();
    abstract void  stop();
    static void start(){                                            // it has static method
        System.out.println("The bike");
    }
    final void owner(){                                              //abstract method can have final method
        System.out.println("Owner of bike ");
    }
}

public class Main extends Bike {
    void run() {
        System.out.println("Bike is Running ");
    }
    void stop() {
        System.out.println("Bike is stop");
    }
    static void start(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Bike bike = new Main();
        main.run();
        main.stop();
        main.start();
        bike.start();
    }
}
