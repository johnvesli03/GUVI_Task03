package com.task;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the Employee details: ");
        System.out.print("Enter the Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Employee Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter the Product details: ");
        System.out.print("Enter the Product ID: ");
        int pid= scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the Product Quantity: ");
        int quantity = scanner.nextInt();

        Employee employee = new Employee(empId, name,salary);
        Product product = new Product(pid, price,quantity);

        System.out.println("Employee Income Tax: " + employee.calcTax());
        System.out.println("Product Tax: " + product.calcTax());
    }
}
