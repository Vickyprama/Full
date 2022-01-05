package com.full.inter;

public interface Hello {
    void start() ;
    void stop();
    default void touch(){
        System.out.println("Touch");
    }
}
