import java.util.Scanner;
public class leap_year
{
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
		int year= sc.nextInt();
		if(year<1582){
			System.out.println("year should be 1582 or later acording to gregorian calender ");
		}
		else{
			if(year%400==0){
				System.out.println("year is a leap year");
			}else if(year%100==0){
				System.out.println("year is not a leap year");
			}else if(year%4==0){
				System.out.println("year is a leap year");
			}
			else{
				System.out.println("not a leap year");
			}
		}
	}
}