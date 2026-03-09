import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        System.out.print("Enter Account Holder Name: ");
        b1.accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        b1.accountNumber = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        b1.balance = sc.nextDouble();
        System.out.print("Enter Amount to Deposit: ");
        double depositAmount = sc.nextDouble();
        b1.deposit(depositAmount);
        System.out.print("Enter Amount to Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        b1.withdraw(withdrawAmount);
        b1.displayBalance();
    }
}