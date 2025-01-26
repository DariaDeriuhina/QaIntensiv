package classes_oop_lesson2.homework.oop.task8;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Checking Account does not accrue interest.");
    }
}
