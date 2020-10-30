package technoStudy.Day29.task3;

public class BankAccount {
    public String customerName;
    public double customerBalance;
    public static double balance;

    public void deposit(double amount) {
        balance += amount;
        customerBalance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
        customerBalance -= amount;
    }
}
