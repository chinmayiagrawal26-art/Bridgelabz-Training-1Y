package com.gla.storyBased;
class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;
    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Base Amount: ₹" + baseAmount);
    }
}
class RegularOrder extends Order {
    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill() {
        return baseAmount + deliveryCharge; // No discount
    }
}
class PremiumOrder extends Order {
    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    @Override
    double calculateBill() {
        double discount = baseAmount * 0.20; // 20% discount
        return (baseAmount - discount) + deliveryCharge;
    }
}
class FoodDeliveryApp {
    public static void main(String[] args) {
        Order o1 = new RegularOrder(1, 500);
        Order o2 = new PremiumOrder(2, 500);
        o1.display();
        System.out.println("Total Bill (Regular): ₹" + o1.calculateBill());
        System.out.println();
        o2.display();
        System.out.println("Total Bill (Premium): ₹" + o2.calculateBill());
    }
}