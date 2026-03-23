package com.gla.storyBased;
class Account {
    int accountNumber;
    double balance;
    static String bankName = "ABC Bank";
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    double calculateInterest() {
        return 0;
    }
    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}
class CurrentAccount extends Account {
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
class BankSystem {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(101, 10000);
        Account a2 = new CurrentAccount(102, 10000);
        a1.display();
        System.out.println("Interest (Savings): ₹" + a1.calculateInterest());
        System.out.println();
        a2.display();
        System.out.println("Interest (Current): ₹" + a2.calculateInterest());
    }
}
