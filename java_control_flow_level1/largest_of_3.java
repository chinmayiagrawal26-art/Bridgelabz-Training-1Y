import java.util.Scanner;
public class largest_of_3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number:");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("is the first number the largest? YES");
		}else if(num2>num1 && num2>num3){
			System.out.println("is the second number the largest? YES");
		}else if(num3>num1 && num3>num2){
			System.out.println("is the third number the largest? YES");
		}
	}
}	