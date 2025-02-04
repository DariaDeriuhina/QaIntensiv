package complex_tasks_lesson5.bank;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    private List<Account> listOfAccounts;
    private Account account;

    public BankApp(Account account){
        this.account = account;
        listOfAccounts = new ArrayList<>();
        listOfAccounts.add(account);
    }

    public double showBalance(){
        return account.getBalance();
    }

    public void switchToAnotherAccount(String id){
        Account newAccount = listOfAccounts.stream().filter(el -> el.getId().equals(id))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("No such account in the database"));
        account = newAccount;
    }

    public void addAccountToBank(Account account) {
        if (listOfAccounts.contains(account)) {
            System.out.println("Your Account is already on the database");
        } else {
            listOfAccounts.add(account);
        }
    }

    public void transferMoney(String id, double money) {
        Account newAccount = listOfAccounts.stream().filter(el -> el.getId().equals(id))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("No such account in the database"));
        if (showBalance() < money) {
            System.out.println("Your balance is not enough");
        } else {
            account.setBalance(account.getBalance() - money);
            Account secondAccount = newAccount;
            secondAccount.setBalance(secondAccount.getBalance() + money);
        }
    }

    public void topUpAccount(double money){
        account.setBalance(account.getBalance() + money);
    }
}
