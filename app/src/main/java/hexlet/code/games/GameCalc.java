package hexlet.code.games;

import static hexlet.code.Cli.askName;
import java.util.Scanner;

public class GameCalc {

    public static void calcGame(){

        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

            for (int i = 1; i <= 1; i++) {
                var randomNumber1 = (int) (Math.floor(Math.random() * 30) + 1);
                var randomNumber2 = (int) (Math.floor(Math.random() * 30) + 1);
                var randomNumber3 = (int) (Math.floor(Math.random() * 30) + 1);
                var randomNumber4 = (int) (Math.floor(Math.random() * 30) + 1);
                var randomNumber5 = (int) (Math.floor(Math.random() * 30) + 1);
                var randomNumber6 = (int) (Math.floor(Math.random() * 30) + 1);

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

                System.out.println("Question: " + randomNumber3 + " + " + randomNumber4);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randomNumber3 + randomNumber4)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber3 + randomNumber4) + "'.");
                    System.out.println("Let's try again," + name + "!");
                    return;
                }

                System.out.println("Question: " + randomNumber5 + " - " + randomNumber6);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randomNumber5 - randomNumber6)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber5 - randomNumber6) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        System.out.println("Congratulations, " + name + "!");
        }
    }
