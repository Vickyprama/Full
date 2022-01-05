package com.full.over;

import java.util.*;

public class Main3 {
    static void arr(short r,byte w) {
        System.out.println(r+w);
    }
    static   void  arr(int f,long w) { /* type promation for int to long */
        System.out.println(f+w);
    }
    public static void main(String[] args){
        Main3.arr(7,78876);
        Main3.arr(7,7);

    }
}
