import java.util.Scanner;
class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int[] result = {quotient, remainder};
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number = sc.nextInt();
        System.out.print("Enter second number: ");
        int divisor = sc.nextInt();
        int[] ans = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient = " + ans[0]);
        System.out.println("Remainder = " + ans[1]);
        sc.close();
    }
}