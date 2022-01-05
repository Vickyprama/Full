package com.full.linked;
import java.util.*;

// tree set problem get number less than 7

public class Problem {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        set.add(3);
        set.add(122);
        set.add(5);
        set.add(34);
        set.add(12);
        System.out.println("Enter number ");
        int num = input.nextInt();
        for (int k : set) {
            if(k <= num){
                System.out.print(k+" ");
            }
        }
    }
}
