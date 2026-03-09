import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.print("Enter Employee Name: ");
        e1.name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        e1.id = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        e1.salary = sc.nextDouble();
        System.out.println("\nEmployee Details:");
        e1.display();
    }
}