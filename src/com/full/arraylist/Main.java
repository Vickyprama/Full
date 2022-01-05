package com.full.arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Number of elements in list : ");
        int number =input.nextInt();
        for (int i = 0; i <number ; i++) {
            System.out.println("Enter color : ");
            list.add(input.next());
        }
        System.out.println(list);
        System.out.println("The colors are : ");
        for (String output:list) {                                      //iterate using for loop
            System.out.print(output+" ");
        }
       list.add(0,"Rose");              // to add particular value at specified index
        System.out.println(list);

        System.out.println(list.get(0));            // to retrieve particular value

        list.set(2,"red");
        System.out.println(list);                       // to replace the particular index

        list.remove(2);
        System.out.println(list);                       // to remove index value

        if(list.contains("red")){                               // contains used for search particular element
            System.out.println("element is present ");
        }
        else{
            System.out.println("not present ");
        }
        System.out.println(list);
        Collections.sort(list);                                 ///to sort the array list
        System.out.println(list);
    }
}
