import java.util.Scanner;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket m1 = new MovieTicket();
        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        m1.bookTicket(name, seat, price);
        System.out.println("\nTicket Details:");
        m1.displayTicket();
    }
}