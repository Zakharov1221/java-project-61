package hexlet.code;

import java.util.Scanner;

public class Cli {
    static Scanner console = new Scanner(System.in);

    public static String askName() {

        System.out.print("May I have your name? ");
        String name = console.nextLine();
        System.out.println("Hello, " + name + ".");

        return name;
    }

    public static void evenGame(){

        String name = askName();
        String correctAnswer = "yes";
        String incorrectAnswer = "no";
        int gameCount = 3;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 1; i <= gameCount; i = i + 1) {
            var randomNumber = (int) (Math.floor(Math.random() * 98) + 1);
            System.out.println("Question: " + randomNumber);
            String answer = console.nextLine();
            System.out.println("Your answer: " + answer);

            if (randomNumber % 2 == 0 && answer.equals(correctAnswer) || randomNumber % 2 != 0 && answer.equals(incorrectAnswer)){
                System.out.println("Correct!");

            } else if (randomNumber % 2 != 0 && answer.equals(correctAnswer)){
                System.out.println("'yes' wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                break;

            } else if (randomNumber % 2 == 0 && answer.equals(incorrectAnswer)){
                System.out.println("'no' wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name);
                break;

            } else {
                System.out.println("Wrong answer anyway!");
                System.out.println("Let's try again, " + name);
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}