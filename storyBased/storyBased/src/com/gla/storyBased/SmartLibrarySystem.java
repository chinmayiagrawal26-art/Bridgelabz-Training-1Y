package com.gla.storyBased;
class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "City Library";
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    double calculateFine(int daysLate) {
        return 0;
    }
    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}
class TextBook extends Book {

    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2;  // ₹2 per day
    }
}
class Magazine extends Book {
    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5;  // ₹5 per day
    }
}
 class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new TextBook(101, "Java Basics", 250);
        Book b2 = new Magazine(201, "Tech Monthly", 100);
        b1.display();
        System.out.println("Fine (TextBook): ₹" + b1.calculateFine(3));
        System.out.println();
        b2.display();
        System.out.println("Fine (Magazine): ₹" + b2.calculateFine(3));
    }
}
