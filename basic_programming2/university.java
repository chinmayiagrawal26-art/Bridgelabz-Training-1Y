//pdf1 question-9
import java.util.Scanner;
public class university 
{
    public static void main(String[]args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter the university discount percent: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("Discount amount is: " + discount);
        System.out.println("Fee to be paid after discount is: " + finalFee);
        sc.close();
    }
}