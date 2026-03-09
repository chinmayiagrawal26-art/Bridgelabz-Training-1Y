import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;
    void display(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i1 = new Item();
        System.out.print("Enter Item Code: ");
        i1.itemCode = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Item Name: ");
        i1.itemName = sc.nextLine();
        System.out.print("Enter Price of Item: ");
        i1.price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("\nItem Details:");
        i1.display(quantity);
    }
}