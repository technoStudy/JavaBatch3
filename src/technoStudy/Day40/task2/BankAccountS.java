package technoStudy.Day40.task2;

public class BankAccountS {
    private String userId;
    private double balance;
    private CurrencyS currency;

    public BankAccountS(String userId, CurrencyS currency) {
        this.userId = userId;
        this.currency = currency;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public CurrencyS getCurrency() {
        return currency;
    }

    public void deposit(double amount){
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
