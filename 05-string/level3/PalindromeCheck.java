import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }
        return reverse;
    }
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        if (isPalindromeLoop(text))
            System.out.println("Logic 1 (Loop): Palindrome");
        else
            System.out.println("Logic 1 (Loop): Not Palindrome");
        if (isPalindromeRecursive(text, 0, text.length() - 1))
            System.out.println("Logic 2 (Recursion): Palindrome");
        else
            System.out.println("Logic 2 (Recursion): Not Palindrome");
        if (isPalindromeArray(text))
            System.out.println("Logic 3 (Array): Palindrome");
        else
            System.out.println("Logic 3 (Array): Not Palindrome");
        sc.close();
    }
}