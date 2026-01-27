import java.util.Scanner;
public class vote
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of the person:");
		int age= sc.nextInt();
		if(age>=18){
			System.out.println("the person can vote? YES");
		}else{
				System.out.println("the person can vote? NO");
			}
	}
}