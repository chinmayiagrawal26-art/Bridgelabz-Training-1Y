//pdf2 question-4
import java.util.Scanner;
class disConverter 
{
    public static void main(String[]args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
        sc.close();
    }
}