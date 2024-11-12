package com.ejercicio_iv_a;

public class Salary {
    private double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateNetSalary() {
        return salary * 0.80;
    }
}
