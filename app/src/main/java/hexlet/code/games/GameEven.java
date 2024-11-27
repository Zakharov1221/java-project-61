package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.askName;

public class GameEven {

    public static void evenGame(){

        String name = askName();
        Scanner console = new Scanner(System.in);
        int gameCount = 3;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 1; i <= gameCount; i = i + 1) {
            var randomNumber = (int) (Math.floor(Math.random() * 98) + 1);
            System.out.println("Question: " + randomNumber);
            String answer = console.nextLine();
            System.out.println("Your answer: " + answer);

            if (randomNumber % 2 == 0 && answer.equals("yes") || randomNumber % 2 != 0 && answer.equals("no")){
                System.out.println("Correct!");

            } else if (randomNumber % 2 != 0 && answer.equals("yes")){
                System.out.println("'yes' wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                return;

            } else if (randomNumber % 2 == 0 && answer.equals("no")){
                System.out.println("'no' wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name);
                return;

            } else {
                System.out.println("Wrong answer anyway!");
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
