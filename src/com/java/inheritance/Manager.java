package com.java.inheritance;
// Create a child class
//Manager that extends Employee and adds department name and bonus. Display complete
//salary details of the manager.
class Manager extends Employee {

    private String departmentName;
    private double bonus;

    // Constructor
    public Manager(int employeeId, String name, double basicSalary,
                   String departmentName, double bonus) {
        super(employeeId, name, basicSalary);
        this.departmentName = departmentName;
        this.bonus = bonus;
    }

    // Display complete salary details
    public void displaySalaryDetails() {
        double totalSalary = basicSalary + bonus;

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Department   : " + departmentName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + totalSalary);
    }
}
