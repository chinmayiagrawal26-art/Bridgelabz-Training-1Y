import java.util.Scanner;
public class sum_of_natural_no
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		if(num>0){
			int sum= (num*(num+1))/2;
			System.out.println("the sum of "+num+" natural mumbers is "+sum);
		}else{
				System.out.println("the number "+num+" is not a natural number");
			}
	}
}