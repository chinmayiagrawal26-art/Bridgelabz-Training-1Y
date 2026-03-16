package com.gla.college.student;

public class Student {
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + roll);
    }

}