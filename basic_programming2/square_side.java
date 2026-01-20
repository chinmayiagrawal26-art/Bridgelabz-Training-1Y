//pdf2 question-3
import java.util.Scanner;
class square_side
 {
    public static void main(String[]args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("the lenghth of the side is: " + side);
		System.out.println("and the perimeteris:" +perimeter);
        sc.close();
    }
}