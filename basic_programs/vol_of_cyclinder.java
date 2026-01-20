import java.util.Scanner;
class vol_of_cyclinder
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter radius:");
		int r=input.nextInt();
		System.out.println("enter height:");
		int h=input.nextInt();
		double ar=3.14*r*r*h;
		System.out.println("volume of cylinder= "+ar);
	}
}