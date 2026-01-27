import java.util.Scanner;
public class sum_until_0
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		double num;
		System.out.println("enter the numbers (0 to stop):");
		num=sc.nextDouble();
		while(num!=0){
			total= total+num;
			System.out.println("enter a number (0 to stop)");
			num= sc.nextDouble();
		}
		System.out.println("sum of entered numbers ="+total);
		
	}
}