package com.gla.threads;
class BankAccount implements Runnable {
    private String accountHolderName;
    private String accountType;
    public BankAccount(String name, String type) {
        this.accountHolderName = name;
        this.accountType = type;
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    accountType + " User: " + accountHolderName +" | Checking Balance (" + i + ")" + " | Thread Priority: " + t.getPriority()
            );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount premiumUser = new BankAccount("Alice", "Premium");
        BankAccount regularUser = new BankAccount("Bob", "Regular");
        BankAccount basicUser = new BankAccount("Charlie", "Basic");
        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}