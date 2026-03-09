import java.util.Scanner;
class PalindromeChecker {
    String text;
    boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        if (text.equals(rev))
            return true;
        else
            return false;
    }
    void displayResult() {
        if (isPalindrome())
            System.out.println("The text is a Palindrome.");
        else
            System.out.println("The text is not a Palindrome.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p1 = new PalindromeChecker();
        System.out.print("Enter text: ");
        p1.text = sc.nextLine();
        p1.displayResult();
    }
}