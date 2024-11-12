package com.ejercicio_iv_a;

public class Employee {
    private String name;
    private Salary salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = new Salary(salary);
    }

    public String getName() {
        return name;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Net Salary: " + salary.calculateNetSalary());
    }
}
