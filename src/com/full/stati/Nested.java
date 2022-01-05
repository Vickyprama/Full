package com.full.stati;

 public class Nested {
     static class print{
         static void display(){
             System.out.println("hiii");
         }
     }

     public static void main(String[] args) {
         Nested.print.display();
     }
}
