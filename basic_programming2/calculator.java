//pdf2 question-1
import java.util.Scanner;
class calculator
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number:");
		float num1= sc.nextFloat();
		System.out.println("enter second number:");
		float num2= sc.nextFloat();
		System.out.println("\nResults:");
		System.out.println("Addition=" + (num1+num2));
		System.out.println("Subtraction=" + (num1-num2));
		System.out.println("Multiplication=" + (num1*num2));
		System.out.println("Division=" + (num1/num2));
		sc.close();
	}
}	