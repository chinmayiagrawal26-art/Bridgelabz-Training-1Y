//pdf2 question-2
import java.util.Scanner;
class area_of_triangle
 {
    public static void main(String[]args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.45;
        System.out.println("Area of triangle in square centimeters: " + areaCm);
        System.out.println("Area of triangle in square inches: " + areaInch);
        sc.close();
    }
}