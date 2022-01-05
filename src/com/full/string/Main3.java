package com.full.string;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "Java exercise";
        String input1 ="jhn";
        input = input.concat(input1);
        System.out.println(input);
        int index = in.nextInt();
        int index1 = in.nextInt();
        char k = input.charAt(index);
        int  t =  input.codePointAt(1);
        System.out.println(k+" "+t);
       // int  k =  input.codePointAt(1);
        Calendar c = Calendar.getInstance();
        System.out.format("Current date : %td %tb %tY \nCurrent day : %tA \nCurrent time : %tT %tp \nCurrent time zone : %tZ",c,c,c,c,c,c,c);
    }
}
