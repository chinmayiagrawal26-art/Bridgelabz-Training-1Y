//pdf1 question5
import java.util.Scanner;
class pens
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of pens:");
		int totalPens= sc.nextInt();
		System.out.println("enter number of students:");
		int totalstudents= sc.nextInt();
		int pensPerPerson= totalPens/totalstudents;
		int remainingPens=totalPens%totalstudents;
		System.out.println("the pen per person is" +pensPerPerson + "and the remaining pen mot distribuited is" +remainingPens);
	}
}

