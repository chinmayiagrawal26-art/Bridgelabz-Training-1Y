package com.gla.encpsulation1;
    interface Taxable {
        double calculateTax();
        String getTaxDetails();
    }

    // Abstract Class
    abstract class Product {
        private int productId;
        private String name;
        private double price;

        // Constructor
        public Product(int productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        // Encapsulation (Getters & Setters)
        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Abstract Method
        abstract double calculateDiscount();

        // Common Method
        public void displayDetails() {
            System.out.println("ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    // Electronics Class
    class Electronics extends Product implements Taxable {

        public Electronics(int id, String name, double price) {
            super(id, name, price);
        }

        @Override
        double calculateDiscount() {
            return getPrice() * 0.10; // 10% discount
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.18; // 18% tax
        }

        @Override
        public String getTaxDetails() {
            return "Electronics Tax: 18%";
        }
    }

    // Clothing Class
    class Clothing extends Product implements Taxable {

        public Clothing(int id, String name, double price) {
            super(id, name, price);
        }

        @Override
        double calculateDiscount() {
            return getPrice() * 0.20; // 20% discount
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.05; // 5% tax
        }

        @Override
        public String getTaxDetails() {
            return "Clothing Tax: 5%";
        }
    }

    // Groceries Class
    class Groceries extends Product {

        public Groceries(int id, String name, double price) {
            super(id, name, price);
        }

        @Override
        double calculateDiscount() {
            return getPrice() * 0.05; // 5% discount
        }
    }

    // Main Class
    public class ECommercePlatform {

        // Polymorphic Method
        public static void printFinalPrice(Product product) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            // Check if product is taxable
            if (product instanceof Taxable) {
                Taxable t = (Taxable) product;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = price + tax - discount;

            product.displayDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------");
        }

        public static void main(String[] args) {

            // Polymorphism (Product reference)
            Product p1 = new Electronics(1, "Laptop", 50000);
            Product p2 = new Clothing(2, "Shirt", 2000);
            Product p3 = new Groceries(3, "Rice", 1000);

            Product[] products = {p1, p2, p3};

            // Process all products
            for (Product p : products) {
                printFinalPrice(p);
            }
        }
    }

