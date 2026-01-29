package com.java.basics;
//Create a Student class in Java.
//Take marks of 3 subjects as input.
//Calculate total and average marks.
//Display student marks, total, and average.
public class Student {
    int subj1;
    int subj2;
    int subj3;
    public  Student(int m1,int m2,int m3)
    {
        this.subj1=m1;
        this.subj2=m2;
        this.subj3=m3;
    }
    public void displayDetails()
    {
        System.out.println("Markes subject 1" +this.subj1);
        System.out.println("Markes subject 2" +this.subj2);

        System.out.println("Markes subject 3" +this.subj3);
        int total=subj1+subj2+subj3;
        double avg=total/3;
        System.out.println("Total:"+total);
        System.out.println("Average :"+avg);


    }
}
