//pdf1 question7
import java.util.Scanner;
public class vol_of_earth 
{
    public static void main(String[]args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Earth in kilometers: ");
        double radiusKm = sc.nextDouble();
        double volume1 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm * 0.621371;
        double volume2 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f\n", volume1);
        System.out.printf("The volume of earth in cubic miles is %.2f\n", volume2);
        sc.close();
    }
}