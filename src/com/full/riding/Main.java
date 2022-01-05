package com.full.riding;

public class Main {
    public static void main(String[] args) {
        Interest inter = new Interest();
        Sbi sbi = new Sbi();
        Central central = new Central();
        inter.rate();
        sbi.rate();
        sbi.leave();
        central.rate();
    }
}
