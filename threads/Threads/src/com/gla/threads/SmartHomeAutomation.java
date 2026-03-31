package com.gla.threads;
import java.time.LocalTime;
class Device implements Runnable {
    private String deviceName;
    private int interval;
    public Device(String name, int interval) {
        this.deviceName = name;
        this.interval = interval;
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "[" + LocalTime.now() + "] " + deviceName + " | Cycle: " + i + " | Priority: " + t.getPriority()
            );
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted");
            }
        }
        System.out.println(deviceName + " finished execution.");
    }
}
class SmartHome {
    public static void main(String[] args) {
        Device temperature = new Device("Temperature Sensor", 5000);
        Device security = new Device("Security Camera", 3000);
        Device light = new Device("Light Controller", 4000);
        Device door = new Device("Door Lock Monitor", 6000);
        Thread t1 = new Thread(temperature);
        Thread t2 = new Thread(security);
        Thread t3 = new Thread(light);
        Thread t4 = new Thread(door);
        t2.setPriority(10);
        t1.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\nAll devices have completed their cycles. System shutting down...");
    }
}