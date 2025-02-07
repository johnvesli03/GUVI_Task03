package com.task;

class Employee implements Taxable
{
    int empId;
    String name;
    double salary;

    public Employee(int empId,String name, double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public double calcTax(){
        return incomeTax * salary; // returns payable tax
    }
}

