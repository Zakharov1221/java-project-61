package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.askName;

public class Engine {

    static Scanner console = new Scanner(System.in);

    public static void calcGame(){

        String name = askName();

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
                    break;
                }

                System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randomNumber1 + randomNumber2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 + randomNumber2) + "'.");
                    System.out.println("Let's try again," + name + "!");
                    break;
                }

                System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                answer = console.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == (randomNumber1 - randomNumber2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber1 - randomNumber2) + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        System.out.println("Congratulations, " + name + "!");
    }
}
