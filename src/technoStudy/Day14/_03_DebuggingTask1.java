package technoStudy.Day14;

import java.util.Scanner;

public class _03_DebuggingTask1 {
    // get text from the user, print only unique characters, remove all duplicates
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String characterIHaveSeenAlready = "";
        for (int i = 0; i < userInput.length(); i++) {
            char charAt = userInput.charAt(i);
            if(!characterIHaveSeenAlready.contains(charAt+"")){  // only add if haven't seen before
                characterIHaveSeenAlready += charAt;
            }
        }

        System.out.println(characterIHaveSeenAlready);
    }
}

