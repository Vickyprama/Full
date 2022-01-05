package com.full.basics;

public interface Sbi {
    public interface mes{               // nested interface
        void print();
    }
    void  debit();
    void password();

    static void voice(){
        System.out.println("Speck");            // static
    }
    default void dance(){                           // default
        System.out.println("Dance together");
    }
}
