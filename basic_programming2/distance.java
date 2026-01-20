//pdf1 question-3
import java.util.Scanner;
class distance
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter distance in km:");
		double km= sc.nextDouble();
		double miles= km * 1.6;
		System.out.println("the distance" +km + "km in miles is" +miles);
	}
}