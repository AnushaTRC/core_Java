package com.java.inheritance;

class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}
