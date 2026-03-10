import java.util.Scanner;
class ChocoDivision {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int[] result = {quotient, remainder};
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        int[] ans = findRemainderAndQuotient(chocolates, children);
        System.out.println("Chocolates each child gets = " + ans[0]);
        System.out.println("Remaining chocolates = " + ans[1]);
        sc.close();
    }
}