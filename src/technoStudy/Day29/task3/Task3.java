package technoStudy.Day29.task3;

public class Task3 {
    public static void main(String[] args) {
        BankAccount techno = new BankAccount();
        techno.customerName = "Techno";

        BankAccount study = new BankAccount();
        study.customerName = "Study";

        techno.deposit(100);
        study.deposit(200);
        techno.withdraw(50);
        study.withdraw(50);
        techno.withdraw(100);
        study.withdraw(150); // problem

        // what is the final balance of all accounts, == 200?
        System.out.println(BankAccount.balance);
        System.out.println(techno.customerBalance);
        System.out.println(study.customerBalance);

    }
}
