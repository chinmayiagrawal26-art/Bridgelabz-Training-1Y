import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    void removeItem(int q) {
        if (q <= quantity) {
            quantity = quantity - q;
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Not enough quantity in cart.");
        }
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem c1 = new CartItem();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        c1.addItem(name, price, quantity);
        System.out.print("Enter quantity to remove: ");
        int remove = sc.nextInt();
        c1.removeItem(remove);
        System.out.println("\nCart Details:");
        c1.displayTotalCost();
    }
}