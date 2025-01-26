package classes_oop_lesson2.homework.oop.task8;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private static int counter = 1;

    public BankAccount(double balance) {
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }

    private String generateAccountNumber(){
        return "AAA" + counter++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void calculateInterest();

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


}
