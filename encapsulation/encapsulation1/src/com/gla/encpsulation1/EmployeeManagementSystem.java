package com.gla.encpsulation1;
    interface Department {
        void assignDepartment(String deptName);
        String getDepartmentDetails();
    }
    abstract class Employee {
        private int employeeId;
        private String name;
        private double baseSalary;
        public Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }
        public int getEmployeeId() {
            return employeeId;
        }
        public String getName() {
            return name;
        }
        public double getBaseSalary() {
            return baseSalary;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }
        abstract double calculateSalary();
        public void displayDetails() {
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
        }
    }
    class FullTimeEmployee extends Employee implements Department {
        private String department;

        public FullTimeEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }
        @Override
        double calculateSalary() {
            return getBaseSalary(); // fixed salary
        }
        @Override
        public void assignDepartment(String deptName) {
            this.department = deptName;
        }
        @Override
        public String getDepartmentDetails() {
            return "Department: " + department;
        }
    }
    class PartTimeEmployee extends Employee implements Department {
        private int hoursWorked;
        private String department;

        public PartTimeEmployee(int id, String name, double rate, int hoursWorked) {
            super(id, name, rate);
            this.hoursWorked = hoursWorked;
        }

        @Override
        double calculateSalary() {
            return getBaseSalary() * hoursWorked;
        }

        @Override
        public void assignDepartment(String deptName) {
            this.department = deptName;
        }

        @Override
        public String getDepartmentDetails() {
            return "Department: " + department;
        }
    }
    public class EmployeeManagementSystem {
        public void main(String[] args) {
            Employee emp1 = new FullTimeEmployee(101, "Alice", 50000);
            Employee emp2 = new PartTimeEmployee(102, "Bob", 500, 20);
            ((Department) emp1).assignDepartment("HR");
            ((Department) emp2).assignDepartment("IT");
            Employee[] employees = {emp1, emp2};
            for (Employee emp : employees) {
                emp.displayDetails();
                System.out.println("Salary: " + emp.calculateSalary());
                System.out.println(((Department) emp).getDepartmentDetails());
                System.out.println("----------------------");
            }
        }
    }