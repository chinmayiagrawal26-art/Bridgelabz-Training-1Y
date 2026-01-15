//pdf2 question-5
import java.util.Scanner;
public class total_purchase 
{
    public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quan = sc.nextInt();
        double tp = unitPrice * quan;
        System.out.println("The total purchase price is INR " + tp +" if the quantity " + quan +" and unit price is INR " + unitPrice);
        sc.close();
    }
}