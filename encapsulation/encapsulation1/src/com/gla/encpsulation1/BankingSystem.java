package com.gla.encpsulation1;
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    double calculateInterest() {
        return getBalance() * 0.04;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // simple logic
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    @Override
    double calculateInterest() {
        return 0; // no interest
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // higher eligibility
    }
}
public class BankingSystem {
    public static void processAccount(BankAccount acc) {
        acc.displayDetails();
        double interest = acc.calculateInterest();
        System.out.println("Interest: " + interest);
        if (acc instanceof Loanable) {
            Loanable loan = (Loanable) acc;
            double eligibility = loan.calculateLoanEligibility();
            System.out.println("Loan Eligibility: " + eligibility);
            loan.applyForLoan(5000);
        }
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("ACC101", "Alice", 20000);
        BankAccount acc2 = new CurrentAccount("ACC102", "Bob", 30000);
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc2.deposit(10000);
        acc2.withdraw(50000);
        BankAccount[] accounts = {acc1, acc2};
        for (BankAccount acc : accounts) {
            processAccount(acc);
        }
    }
}

