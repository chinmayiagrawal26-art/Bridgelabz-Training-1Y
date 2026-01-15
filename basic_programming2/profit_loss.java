//pdf1 question-4
import java.util.Scanner;
class profit_loss
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter cost price:");
		int costprice= sc.nextInt();
		System.out.println("enter selling price:");
		int sellingprice= sc.nextInt();
		int profit= sellingprice-costprice;
		System.out.println("profit is:" +profit);
		double profitpercentage= (profit*100)/costprice;
		System.out.println("profit percentage is:" +profitpercentage);
	}
}