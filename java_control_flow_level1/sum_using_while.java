import java.util.Scanner;
public class sum_using_while
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("please enter number greater than 0");
		}else{
			int sumwhile=0;
			int i=1;
			while(i<=n){
				sumwhile= sumwhile+i;
				i++;
			}
			int sumFormula= n*(n+1)/2;
			System.out.println("sum using while loop:"+sumwhile);
		    System.out.println("sum using formula:"+sumFormula);	
			if(sumwhile==sumFormula){
				System.out.println("result is correct both are matching");
			}else{
				System.out.println("result is incorrect both are not matching");
			}
		} 
		
	}
}