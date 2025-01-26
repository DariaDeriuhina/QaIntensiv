package classes_oop_lesson2.homework.oop.task8;

public class SavingAccount extends BankAccount{

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance()*0.05;
        deposit(interest);
        System.out.println("Savings Account Interest Added: " + interest);
    }
}
