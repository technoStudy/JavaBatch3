package technoStudy.Day43.task2;

public class BankAccount {
    private String userId;
    private double balance;

    public BankAccount(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0) {
            throw new IllegalArgumentException("The amount should be greater than zero!");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0) {
            throw new IllegalArgumentException("The amount should be greater than zero!");
        }
        if(balance - amount < 0){
            throw new IllegalArgumentException("Not enough to withdraw, transaction denied!");
        }
        balance -= amount;
    }
}
