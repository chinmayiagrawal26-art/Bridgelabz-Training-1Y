import java.util.Scanner;                                                                                                                                                        import java.util.Scanner;
public class spring_season
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month(1-12):");
		int month= sc.nextInt();
		System.out.println("enter day:");
		int day= sc.nextInt();
		if((month==3 && day>=20)||(month==4)||(month==5)||(month==6 && day<=20)){
			System.out.println("its a spring season");
		}else{
			System.out.println("its not a spring season");
		}
	}
}