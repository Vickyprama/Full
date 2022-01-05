package com.full.school;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student arr[]=new Student[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Student(in.next(), in.nextInt(),in.nextInt());
        }
        for (Student k:arr) {
            k.Print();
        }
        arr[2].studentName="Sachin";     //we can edit particular value
        arr[2].Print();                    // we can get particular index value

    }
}
