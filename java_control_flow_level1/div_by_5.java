import java.util.Scanner;
class div_by_5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		if(num%5==0){
			System.out.println(num +"is divisible by 5");
		}else{
			System.out.println(num +"not divisible by 5");
		}
		sc.close();
	}
}