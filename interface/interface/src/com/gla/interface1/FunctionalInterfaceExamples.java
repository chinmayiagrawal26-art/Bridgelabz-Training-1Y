package com.gla.interface1;
import java.util.function.Predicate;
import java.util.function.Function;
public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("=== Temperature Alert System ===");
        Predicate<Double> isHighTemp = temp -> temp > 30.0;
        double temperature = 35.5;
        if (isHighTemp.test(temperature)) {
            System.out.println("Alert! High Temperature: " + temperature);
        } else {
            System.out.println("Temperature is normal: " + temperature);
        }
        System.out.println("\n=== String Length Checker ===");
        Function<String, Integer> getLength = str -> str.length();
        String message = "Hello Java Programming";
        int length = getLength.apply(message);
        System.out.println("Message: " + message);
        System.out.println("Length: " + length);
        if (length > 20) {
            System.out.println("Message exceeds limit!");
        } else {
            System.out.println("Message within limit.");
        }
        System.out.println("\n=== Background Job Execution ===");
        Runnable task = () -> {
            System.out.println("Task is running in background...");
            try {
                Thread.sleep(2000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task completed!");
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Main thread continues...");
    }
}
