package com.full.inter;

public interface Fan {
    void motor();
    void speed();
    static void current(){
        System.out.println("Current is required");
    }
}
