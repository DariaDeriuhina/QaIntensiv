package classes_oop_lesson2.homework;

public class BankAccount {
    private static int counter = 1;
    private int accountNumber;
    private double balance;

    public BankAccount(){
        balance = 0;
        accountNumber = counter++;
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("You can't deposit negative or zero");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if(balance<amount){
            System.out.println("You don't have enough money, please withdraw less");
            return;
        }

        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
