package technoStudy.Day40.task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        AccountS account1 =  new AccountS("1");
        account1.setBalance(100);
        AccountS account2 =  new AccountS("2");
        account2.setBalance(-100);

        System.out.println(account1.getUserId());
        String userId = account1.getUserId();
        userId = "changed";
        System.out.println(account1.getUserId());

        System.out.println(account2.getUserId());

        String[] array = {"tag1"};
        account1.setTags(array);

        System.out.println(Arrays.toString(account1.getTags()));
        String[] tags = account1.getTags();
        tags[0] = "changedTag";
        System.out.println(Arrays.toString(account1.getTags()));

        account1.setTags(tags); // proper way to change
        System.out.println(Arrays.toString(account1.getTags()));

    }
}
