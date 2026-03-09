import java.util.Scanner;
class MobilePhone {
    String brand;
    String model;
    double price;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m1 = new MobilePhone();
        System.out.print("Enter Brand: ");
        m1.brand = sc.nextLine();
        System.out.print("Enter Model: ");
        m1.model = sc.nextLine();
        System.out.print("Enter Price: ");
        m1.price = sc.nextDouble();
        System.out.println("\nMobile Phone Details:");
        m1.display();
    }
}