package hexlet.code.games;

import static hexlet.code.Cli.askName;
import java.util.Scanner;

public class GameCalc {

    public static void calcGame(){

        String name = askName();
        Scanner console = new Scanner(System.in);
        var randomNumber1 = (int) (Math.floor(Math.random() * 30) + 1);
        var randomNumber2 = (int) (Math.floor(Math.random() * 30) + 1);

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 1; i++) {
            System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
            int answer = console.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == (randomNumber1 * randomNumber2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 * randomNumber2) + "'.");
                System.out.println("Let's try again," + name + "!");
                return;
            }

            System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
            answer = console.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == (randomNumber1 + randomNumber2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 + randomNumber2) + "'.");
                System.out.println("Let's try again," + name + "!");
                return;
            }

            System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
            answer = console.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == (randomNumber1 - randomNumber2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 - randomNumber2) + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
