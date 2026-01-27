import java.util.Scanner;
public class smallest_of_3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number:");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		if(num1<num2 && num1<num3){
			System.out.println("is 1st number the smalles? YES");
		}else{
			System.out.println("is 1st number the smalles? NO");
		}
	}
}