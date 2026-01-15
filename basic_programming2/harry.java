//pdf1b question-1
import java.util.Scanner;
class harry
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name:");
		String name= sc.nextLine();
		System.out.println("enter your birth year:");
		int birthyear= sc.nextInt();
		System.out.println("enter current year:");
		int currentyear= sc.nextInt();
		int age= currentyear - birthyear;
		System.out.println("\nName:" +name);
		System.out.println("Current Age:" +age);
		sc.close();
	}
}
