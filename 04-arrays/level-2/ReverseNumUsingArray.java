import java.util.Scanner;
public class ReverseNumUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int temp = number;
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }
        System.out.print("Reversed number = ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
        sc.close();
    }
}
