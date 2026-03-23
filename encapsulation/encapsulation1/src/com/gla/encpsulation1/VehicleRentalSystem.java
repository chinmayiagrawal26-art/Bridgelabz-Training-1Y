package com.gla.encpsulation1;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate per day: " + rentalRate);
    }
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // sensitive data
    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
    public void showPolicyMasked() {
        System.out.println("Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3));
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Applied";
    }
    public void showPolicyMasked() {
        System.out.println("Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3));
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // extra load cost
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
    public void showPolicyMasked() {
        System.out.println("Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3));
    }
}
public class VehicleRentalSystem {
    public static void processVehicle(Vehicle v, int days) {
        v.displayDetails();
        double rentalCost = v.calculateRentalCost(days);
        double insuranceCost = 0;
        if (v instanceof Insurable) {
            Insurable i = (Insurable) v;
            insuranceCost = i.calculateInsurance();
            System.out.println(i.getInsuranceDetails());
        }
        System.out.println("Rental Cost (" + days + " days): " + rentalCost);
        System.out.println("Insurance Cost: " + insuranceCost);
        if (v instanceof Car) {
            ((Car) v).showPolicyMasked();
        } else if (v instanceof Bike) {
            ((Bike) v).showPolicyMasked();
        } else if (v instanceof Truck) {
            ((Truck) v).showPolicyMasked();
        }
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car("UP32AB1234", 2000, "CAR123456");
        Vehicle v2 = new Bike("UP32XY5678", 500, "BIKE987654");
        Vehicle v3 = new Truck("UP32TR9999", 4000, "TRUCK555888");
        Vehicle[] vehicles = {v1, v2, v3};
        int days = 3;
        for (Vehicle v : vehicles) {
            processVehicle(v, days);
        }
    }
}
