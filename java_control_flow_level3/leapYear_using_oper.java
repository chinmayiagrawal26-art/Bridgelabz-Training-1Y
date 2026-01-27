import java.util.Scanner;
public class leapYear_using_oper
{
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
		int year= sc.nextInt();
			if((year%400==0)||(year%4==0 && year%100!=0)){
				System.out.println(year +"year is a leap year");
			}else{
				System.out.println(year +"not a leap year");
			}
	}
}