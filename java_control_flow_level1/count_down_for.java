import java.util.Scanner;
public class count_down_for
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count down starting number:");
		int counter= sc.nextInt();
		for(int i=counter;i>=1;i--){
			System.out.println(i);
		}
		System.out.println("ROCKET LAUNCHED");
	}
}