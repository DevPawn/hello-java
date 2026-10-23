package c08_test_oop;

public class BankAccount {

    // Features
    private double balance;

    // Builder
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    // Method
    // Setter
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
