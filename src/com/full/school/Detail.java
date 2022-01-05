package com.full.school;
import java.util.*;

public class Detail {
    String studentName;
    int studentId;

    public Detail(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Detail> list = new HashMap<>();
        System.out.println("Enter student Details ");
        System.out.println("Enter Student name and Student ID num : ");
        Detail student1 = new Detail(input.next(), input.nextInt());
        System.out.println("Enter Student name and Student ID num : ");
        Detail student2 = new Detail(input.next(), input.nextInt());
        System.out.println("Enter Student name and Student ID num : ");
        Detail student3 = new Detail(input.next(), input.nextInt());
        list.put(1, student1);
        list.put(2, student2);
        list.put(3, student3);
        list.put(3,new Detail("Lakshmi",76));
        int size = list.size();
        Iterator traverse = list.entrySet().iterator();
        while (traverse.hasNext()) {
            Map.Entry record = (Map.Entry) traverse.next();
            Detail j = (Detail) record.getValue();
            System.out.println("Student detail : " + "\n" + "Student Roll number : " + record.getKey() + " \n" + "Student ID : " + j.studentId + " \n" + "StudentName : " + j.studentName);
        }
        System.out.println("Enter Student roll  number to get details ");
        Integer obj = input.nextInt();
        Iterator trav1 = list.entrySet().iterator();
        while (trav1.hasNext()) {
            Map.Entry record = (Map.Entry) trav1.next();
            Detail j = (Detail) record.getValue();
            switch (obj) {
                case 1: {
                    if (obj == record.getKey()) {
                        System.out.println("Student detail : " + "\n" + "Student Roll number : " + record.getKey() + " \n" + "Student ID : " + j.studentId + " \n" + "StudentName : " + j.studentName);
                    }
                    break;
                }
                case 2: {
                    if (obj == record.getKey()) {
                        System.out.println("Student detail : " + "\n" + "Student Roll number : " + record.getKey() + " \n" + "Student ID : " + j.studentId + " \n" + "StudentName : " + j.studentName);
                        break;
                    }
                }
                case 3: {
                    if (obj == record.getKey()) {
                        System.out.println("Student detail : " + "\n" + "Student Roll number : " + record.getKey() + " \n" + "Student ID : " + j.studentId + " \n" + "StudentName : " + j.studentName);
                        break;
                    }
                }
            }
            if(obj > size) {
                System.out.println("You entered  wrong  roll number ");
                break;
            }
        }
    }
}