package hexlet.code.games;

import static hexlet.code.games.Cli.askName;
import java.util.Scanner;

public class GameCalc {

    public static void calcGame() {

        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

            for (int i = 1; i <= 1; i++) {
                var randN1 = (int) (Math.floor(Math.random() * 30) + 1);
                var randN2 = (int) (Math.floor(Math.random() * 30) + 1);
                var randN3 = (int) (Math.floor(Math.random() * 30) + 1);
                var randN4 = (int) (Math.floor(Math.random() * 30) + 1);
                var randN5 = (int) (Math.floor(Math.random() * 30) + 1);
                var randN6 = (int) (Math.floor(Math.random() * 30) + 1);

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
