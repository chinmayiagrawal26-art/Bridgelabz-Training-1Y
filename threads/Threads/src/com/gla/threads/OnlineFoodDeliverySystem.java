package com.gla.threads;
class Order implements Runnable {
    private int orderId;
    private String restaurantName;
    private int deliveryTime; // in seconds
    public Order(int orderId, String restaurantName, int deliveryTime) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long startTime = System.currentTimeMillis();
        try {
            System.out.println("\nAgent: " + t.getName() + " | Order ID: " + orderId + " | Restaurant: " + restaurantName +
                    " → Picked up");
            Thread.sleep(1000);
            System.out.println("Agent: " + t.getName() + " | Order ID: " + orderId + " → In Transit");
            Thread.sleep(deliveryTime * 1000);
            System.out.println("Agent: " + t.getName() + " | Order ID: " + orderId + " → Delivered ✅");
            long endTime = System.currentTimeMillis();
            System.out.println("Order " + orderId +
                    " completed in " + (endTime - startTime) / 1000.0 + " seconds");
        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " interrupted");
        }
    }
}
class FoodDeliverySystem {
    public static void main(String[] args) {
        Order o1 = new Order(101, "Dominos", 4);
        Order o2 = new Order(102, "KFC", 6);
        Order o3 = new Order(103, "Burger King", 8);
        Order o4 = new Order(104, "Pizza Hut", 5);
        Order o5 = new Order(105, "Subway", 7);
        Thread t1 = new Thread(o1, "Agent-A");
        Thread t2 = new Thread(o2, "Agent-B");
        Thread t3 = new Thread(o3, "Agent-C");
        Thread t4 = new Thread(o4, "Agent-D");
        Thread t5 = new Thread(o5, "Agent-E");
        t1.setPriority(10);
        t4.setPriority(10);
        t2.setPriority(5);
        t5.setPriority(5);
        t3.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\nAll orders have been delivered 🎉");
    }
}
