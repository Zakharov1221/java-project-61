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
                var randN1 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var randN2 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var randN3 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var randN4 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var randN5 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
                var randN6 = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);

                System.out.println("Question: " + randN1 + " * " + randN2);
                int answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randN1 * randN2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randN1 * randN2) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

                System.out.println("Question: " + randN3 + " + " + randN4);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randN3 + randN4)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was'" + (randN3 + randN4) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

                System.out.println("Question: " + randN5 + " - " + randN6);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randN5 - randN6)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randN5 - randN6) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        System.out.println("Congratulations, " + name + "!");
        }
    }
