package com.gla.interface1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*");
    }
}
interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class StaticMethodExamples {
    public static void main(String[] args) {
        System.out.println("=== Password Validator ===");
        String password = "Pass1234";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
        System.out.println("\n=== Unit Conversion ===");
        double km = 10;
        double kg = 5;
        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");
        System.out.println("\n=== Date Formatting ===");
        LocalDate today = LocalDate.now();
        String formatted1 = DateUtils.formatDate(today, "dd-MM-yyyy");
        String formatted2 = DateUtils.formatDate(today, "MMMM dd, yyyy");
        System.out.println("Format 1: " + formatted1);
        System.out.println("Format 2: " + formatted2);
    }
}
