package com.full.inheritance;

public class Main {
    public static void main(String[] args) {
        Human human= new Human();
        Dhoni dhoni=new Dhoni();
        Virat virat = new Virat();
        human.leg();
        human.hand();
        dhoni.name();
        dhoni.hand();
        dhoni.leg();
        dhoni.cricketer();
        virat.name();
        virat.hand();
        virat.leg();
        virat.cricketer();
    }
}
