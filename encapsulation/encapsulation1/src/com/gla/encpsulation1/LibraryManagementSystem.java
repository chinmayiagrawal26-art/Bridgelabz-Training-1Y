package com.gla.encpsulation1;
interface Reservable {
    void reserveItem(String userName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrowerName = null;
    }
    public int getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    protected void setBorrowerName(String name) {
        this.borrowerName = name;
    }
    protected String getBorrowerNameMasked() {
        if (borrowerName == null) return "None";
        return borrowerName.charAt(0) + "****";
    }
    abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrower: " + getBorrowerNameMasked());
    }
}
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    public Book(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    int getLoanDuration() {
        return 14; // 14 days
    }
    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            setBorrowerName(userName);
            isAvailable = false;
            System.out.println("Book reserved successfully!");
        } else {
            System.out.println("Book not available!");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    int getLoanDuration() {
        return 7; // 7 days
    }
    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            setBorrowerName(userName);
            isAvailable = false;
            System.out.println("Magazine reserved successfully!");
        } else {
            System.out.println("Magazine not available!");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    int getLoanDuration() {
        return 3; // 3 days
    }
    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            setBorrowerName(userName);
            isAvailable = false;
            System.out.println("DVD reserved successfully!");
        } else {
            System.out.println("DVD not available!");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
public class LibraryManagementSystem {
    public static void processItem(LibraryItem item) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        if (item instanceof Reservable) {
            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());

            if (r.checkAvailability()) {
                r.reserveItem("Alice");
            }
        }
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        LibraryItem item1 = new Book(1, "Java Basics", "Author A");
        LibraryItem item2 = new Magazine(2, "Tech Monthly", "Author B");
        LibraryItem item3 = new DVD(3, "Learning Java", "Author C");
        LibraryItem[] items = {item1, item2, item3};
        for (LibraryItem item : items) {
            processItem(item);
        }
    }
}