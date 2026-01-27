import java.util.Scanner;
public class employeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus = 0;        
        if (years > 5) {
            bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus (Service is 5 years or less).");
        }
    }
}
