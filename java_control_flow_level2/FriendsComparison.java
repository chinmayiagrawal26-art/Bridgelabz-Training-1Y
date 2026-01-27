import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        float amarHeight = sc.nextFloat();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        float akbarHeight = sc.nextFloat();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        float anthonyHeight = sc.nextFloat();
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }
    }
}
