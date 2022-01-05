package com.full.linked;
import java.util.*;

public class Loop {
    public static void main(String args[]) {
        /*LinkedList declaration*/
        LinkedList<String> linkedlist=new LinkedList<String>();
        linkedlist.add("Apple");
        linkedlist.add("Orange");
        linkedlist.add("Mango");                                    // fot loop
        System.out.println("**For loop**");
        for(int num=0; num<linkedlist.size(); num++)
        {
            System.out.println(linkedlist.get(num));
        }
        System.out.println("**Advanced For loop**");                // for each loop
        for(String str: linkedlist)
        {
            System.out.println(str);
        }
        System.out.println("**Iterator**");                         // Using Iterator
        Iterator i = linkedlist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("**While Loop**");                       // Using While Loop
        int num = 0;
        while (linkedlist.size() > num) {
            System.out.println(linkedlist.get(num));
            num++;
        }
    }
}
