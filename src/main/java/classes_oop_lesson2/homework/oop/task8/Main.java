package classes_oop_lesson2.homework.oop.task8;


public class Main {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[]{new CheckingAccount(100),
                new SavingAccount(120)};

        for(BankAccount bankAccount: bankAccounts){
            System.out.println("Account number " + bankAccount.getAccountNumber());
            bankAccount.deposit(200);
            bankAccount.withdraw(150);
            bankAccount.calculateInterest();
            System.out.println("Final Balance: " + bankAccount.getBalance());
            System.out.println();
        }
    }
}
