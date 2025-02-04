package complex_tasks_lesson5.bank;

public abstract class Account {
    private String id;
    private double balance;
    private static int counter = 1;

    protected Account(){
        id = "AAA" + counter++;
        balance = 0.0;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
