package com.full.stream;

public class Employee {
    int num;
    String name;
    int salary;
    Employee(int num,String name,int salary){
        this.num=num;
        this.name=name;
        this.salary=salary;
    }

    public String  toString() {
        return ("\n"+"Unique num : " + num + "\n" + "Employee name : " + name + "\n" + "Salary " + salary);
    }
}
