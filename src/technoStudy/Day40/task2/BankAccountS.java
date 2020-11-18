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
}
