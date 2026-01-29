package com.java.inheritance;

import com.java.basics.Student;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args)
    {
        /*
================= Key Java/OOP Concepts Covered in This Code =================

1. Class & Object:
   - Customer & PremiumCustomer are classes (blueprints)
   - 'customer' is an object (instance)

2. Inheritance:
   - PremiumCustomer extends Customer
   - Child class inherits variables & methods from parent
   - "IS-A" relationship

3. Constructor:
   - Special method to initialize objects
   - Constructor chaining using super()

4. this Keyword:
   - Refers to current object
   - Differentiates variables from parameters

5. super Keyword:
   - Calls parent constructor
   - Access parent methods or variables if needed

6. Instance Variables:
   - Stored per object
   - Can be reused via inheritance

7. Methods:
   - Define object behavior
   - Can call parent methods (reusability)

8. Encapsulation:
   - Data and methods are grouped
   - Full encapsulation: use private + getters/setters

9. Polymorphism (implicit):
   - Parent class reference can hold child object
   - Allows runtime flexibility (not explicitly shown here)

10. Code Reusability & Maintainability:
    - Child class reuses parent method instead of rewriting
    - Clean structure, easy to extend in future
*/
           //Bank account and savings
        SavingsAccount saobj=new SavingsAccount("1234","Anusha",200.10,3);
        saobj.deposit(100);
        saobj.calculateAndDisplayInterest();
        saobj.displayBalance();
        Manager mobj=new Manager(100,"Anu",10000,"Software",5000);
        mobj.displaySalaryDetails();

        HealthInsurance policy =
                new HealthInsurance("POL12345", "Anusha", 500000, 300000);

        policy.displayDetails();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter markes in subject 1");
        int m1=sc.nextInt();
        System.out.println("Enter marks in subject 2");
        int m2=sc.nextInt();
        System.out.println("Enter marks in subject 3");
        int m3=sc.nextInt();
        Student student=new Student(m1,m2,m3);
        student.displayDetails();
        String s="anusha";
        System.out.println("before"+s);
        String news=s.concat( "potla");
        System.out.println("after"+news);

    }
}
