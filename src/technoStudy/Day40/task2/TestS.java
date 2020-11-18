package technoStudy.Day40.task2;

import org.junit.Assert;
import org.junit.Test;

public class TestS {
    @Test(expected = IllegalArgumentException.class)
    public void withdraw1(){
        // try withdraw 100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw2(){
        // try withdraw -100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw3(){
        // try withdraw 0 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.withdraw(0);
    }

    @Test
    public void withdraw4(){
        // try withdraw 50 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(50);
        double actual = account.getBalance();
        Assert.assertEquals(50, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw5(){
        // try withdraw 150 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(150);
    }

    @Test
    public void withdraw6(){
        // try withdraw 100 with 100 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        account.withdraw(100);
        double actual = account.getBalance();
        Assert.assertEquals(0, actual, 0.0);
    }

    @Test
    public void deposit1(){
        // try deposit 100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(100);
        double actual = account.getBalance();
        Assert.assertEquals(100, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit2(){
        // try deposit -100 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit3(){
        // try deposit 0 with 0 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(0);
    }

    @Test
    public void deposit4(){
        // try deposit 50 with 50 balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(50);
        account.deposit(50);
        double balance = account.getBalance();
        Assert.assertEquals(100, balance, 0.0);
    }

    @Test
    public void deposit5(){
        // try deposit MAX with MAX balance
        BankAccountS account = new BankAccountS("1", CurrencyS.USD);
        account.deposit(Double.MAX_VALUE);
        account.deposit(Double.MAX_VALUE);
        double balance = account.getBalance();
        Assert.assertEquals(Double.MAX_VALUE + Double.MAX_VALUE, balance, 0.0);
    }
}
