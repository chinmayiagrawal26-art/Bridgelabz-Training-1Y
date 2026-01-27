import java.util.Scanner;
class marks
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks of physics");
		int physics= sc.nextInt();
		System.out.println("enter the marks of chem");
		int chem= sc.nextInt();
		System.out.println("enter the marks of maths");
		int maths= sc.nextInt();
		double average= (physics+chem+maths)/3.0;
		char grade;
		String remarks;
			if(average>=80){
				grade= 'A';
				remarks= "level 4, above agency-normalized standards";
			}
			else if(average>=70){
				grade= 'B';
				remarks= "level 3, at agency-normalized standards";
			}else if(average>=60){
				grade= 'C';
				remarks= "level 2, below but approaching standards";
			}else if(average>=50){
				grade= 'D';
				remarks= "level 1, well below standards";
			}else if(average>=40){
				grade= 'E';
				remarks= "level 1-, too below standards";
			}else{
				grade= 'R';
				remarks= "remedial standards";
			}
			System.out.println("AVERAGE MARKS :" +average +"%");
			System.out.println("GRADE :" +grade);
			System.out.println("REMARK :" +remarks);
	}
}