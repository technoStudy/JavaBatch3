package technoStudy.Day40.task1;

import java.util.Arrays;

public class AccountS {
    // instance variable
    // constructors
    // methods
    private String userId;
    private double balance;
    private String[] tags;

    public AccountS(String userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

    public String getUserId() {
        return userId;
    }

    public String[] getTags() {
        // if you want to make sure that tags cannot be changed by reference
//        return tags; // instead of returning the direct reference
        // make a copy and the return copy
        String[] copy = Arrays.copyOf(tags, 1);
        return copy;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
