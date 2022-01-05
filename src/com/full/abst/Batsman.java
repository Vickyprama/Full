package com.full.abst;

public abstract class Batsman {
    abstract void  runs();
    abstract void  bat();
    static void jersey(){
        System.out.println("Indian jersey");
    }
    void kit(){
        System.out.println("kit");
    }

    public static void main(String[] args) {

        Virat virat = new Virat();
        Dhoni dhoni = new Dhoni();
        Batsman.jersey();
        virat.bat();
        virat.kit();
        virat.runs();
        Dhoni.jersey();
        dhoni.bat();
        dhoni.kit();
        dhoni.runs();

    }

}
