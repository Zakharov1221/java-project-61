package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.games.Cli.askName;
import java.util.Scanner;

public class GameCalc {
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static void calcGame() {

        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

            for (int i = 1; i <= 1; i++) {
                var r1 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var r2 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var r3 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var r4 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var r5 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var r6 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);

                System.out.println("Question: " + r1 + " * " + r2);
                int answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (r1 * r2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (r1 * r2) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

                System.out.println("Question: " + r3 + " + " + r4);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (r3 + r4)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was'" + (r3 + r4) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

                System.out.println("Question: " + r5 + " - " + r6);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (r5 - r6)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (r5 - r6) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        System.out.println("Congratulations, " + name + "!");
        }
    }
