import java.util.Scanner;
public class count_down
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count down starting number:");
		int counter= sc.nextInt();
		while(counter>=1){
			System.out.println(counter);
			counter--;
		}
		System.out.println("ROCKET LAUNCHED");
	}
}