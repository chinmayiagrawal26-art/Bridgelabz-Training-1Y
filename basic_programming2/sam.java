//pdf1 question-2
import java.util.Scanner;
class sam
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your maths marks:");
		int maths= sc.nextInt();
		System.out.println("enter your physics marks:");
		int physics= sc.nextInt();
		System.out.println("enter your chemistry marks:");
		int chemistry= sc.nextInt();
		int average= (maths+physics+chemistry)/3;
		System.out.println("average is:" +average);
		sc.close();
	}
}