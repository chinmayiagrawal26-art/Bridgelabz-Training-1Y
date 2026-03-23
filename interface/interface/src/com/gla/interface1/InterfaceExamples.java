package com.gla.interface1;
interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light ON"); }
    public void turnOff() { System.out.println("Light OFF"); }
}
class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC ON"); }
    public void turnOff() { System.out.println("AC OFF"); }
}
class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV ON"); }
    public void turnOff() { System.out.println("TV OFF"); }
}
interface Rentable {
    void rent();
    void returnVehicle();
}
class Car implements Rentable {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}
class Bike implements Rentable {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}
class Bus implements Rentable {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}
interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
public class InterfaceExamples {
    public static void main(String[] args) {
        System.out.println("=== Smart Devices ===");
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();
        d1.turnOn(); d2.turnOn(); d3.turnOn();
        d1.turnOff(); d2.turnOff(); d3.turnOff();
        System.out.println("\n=== Vehicle Rental ===");
        Rentable v1 = new Car();
        Rentable v2 = new Bike();
        Rentable v3 = new Bus();
        v1.rent(); v2.rent(); v3.rent();
        v1.returnVehicle(); v2.returnVehicle(); v3.returnVehicle();
        System.out.println("\n=== Digital Payments ===");
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();
        p1.pay(1000);
        p2.pay(2000);
        p3.pay(500);
    }
}