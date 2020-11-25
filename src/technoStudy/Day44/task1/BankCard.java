package technoStudy.Day44.task1;

public abstract class BankCard {
    private double balance;

    void deposit(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        balance += amount;
    }

    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
