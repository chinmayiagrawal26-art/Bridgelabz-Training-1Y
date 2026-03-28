package com.gla.inheritance;
// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging 🔋");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Electric Vehicle ⚡");
    }
}

// PetrolVehicle subclass implementing interface
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling ⛽");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Petrol Vehicle 🚗");
    }
}
public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);
        System.out.println("---- Electric Vehicle ----");
        ev.displayDetails();
        ev.charge();
        System.out.println("\n---- Petrol Vehicle ----");
        pv.displayDetails();
        pv.refuel();
    }
}