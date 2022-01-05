package com.full.school;

public class Student {
    String  studentName;
    int studentId;
    int studentRoll;

    public Student(String studentName, int  studentId, int  studentRoll){
        this.studentName=studentName;
        this.studentId=studentId;
        this.studentRoll=studentRoll;
    }

    public void Print(){
        System.out.println("Student Name : "+studentName+"\n"+"Student ID : "+studentId+"\n"+"Student Rollno : "+studentRoll);
    }
}
