import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive number:");
		int num=sc.nextInt();
		if(num < 0){
			System.out.println("please enter positive number");
		}else{
			int factorial=1;
			int i=1;
			while(i<=num){
				factorial= factorial*i;
				i++;
			}
			
		    System.out.println("factorial of:" +num+ "is:" +factorial);
		} 
		
	}
}