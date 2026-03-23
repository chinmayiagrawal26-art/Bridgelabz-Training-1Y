package com.gla.storyBased;
class Student {
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "Fail";
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
class EngineeringStudent extends Student {
    String branch;
    EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
        this.name = this.name + " (" + branch + ")";
    }
}
class StudentSystem {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent(101, "Chinmayi", 88, "CSE");
        s1.display();
    }
}
