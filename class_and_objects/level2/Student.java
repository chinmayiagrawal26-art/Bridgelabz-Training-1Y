import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    int marks;
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }
    void display() {
        char grade = calculateGrade();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter Name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        s1.rollNumber = sc.nextInt();
        System.out.print("Enter Marks: ");
        s1.marks = sc.nextInt();
        System.out.println("\nStudent Details:");
        s1.display();
    }
}