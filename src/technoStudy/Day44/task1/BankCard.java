package technoStudy.Day44.task1;

public abstract class BankCard {
    double balance;

    void deposit(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        balance += amount;
    }

    abstract void withdraw(double amount);
}
