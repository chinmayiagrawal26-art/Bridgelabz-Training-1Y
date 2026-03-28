package com.gla.exceptionHandling;
import java.util.Scanner;
class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            try {
                int value = arr[index];
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } finally {
            sc.close();
            System.out.println("Program finished.");
        }
    }
}