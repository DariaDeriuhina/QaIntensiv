package complex_tasks_lesson5.bank;

public class Main {
    public static void main(String[] args) {
        Account personalAccount = new PersonalAccount();
        Account corporateAccount = new CorporateAccount();
        BankApp bankApp = new BankApp(personalAccount);
        bankApp.addAccountToBank(corporateAccount);
        bankApp.topUpAccount(100);
        System.out.println(bankApp.showBalance());
        bankApp.transferMoney("AAA2", 40);
        bankApp.switchToAnotherAccount("AAA2");
        System.out.println(bankApp.showBalance());
    }
}
