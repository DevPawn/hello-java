package c08_oop;

public class BankAccount {

    // Feature
    double balance;

    // Builder
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Tu deposito es de " + amount + " y ahora tienes: " + balance);
    }
}