package com.full.over;
import java.util.*;

public  class Main1{ /*user input overloading */

        public static void main(String[] args){
            Scanner in= new Scanner(System.in);
            Main add=new Main();
            int n1=in.nextInt();
            int n2=in.nextInt();
            int p1=in.nextInt();
            int p2=in.nextInt();
            int p3=in.nextInt();
            add.Add(n1,n2);
            add.Add(p1,p2,p3);
        }

        void Add(int m,int n){
            int j=m+n;
            System.out.println(j);
        }
        void Add(int b,int c,int d){
            int y=b+c+d;
            System.out.println(y);
        }
    }


