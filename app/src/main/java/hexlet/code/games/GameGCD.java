package hexlet.code.games;

import static hexlet.code.Cli.askName;
import java.util.Scanner;

public class GameGCD {

    public static int getDivisor(int num1, int num2) {
        int divisor = Math.min(num1, num2);

        while (divisor > 0) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                return divisor;
            } else {
                divisor --;
            }
        }
        return divisor;
    }

    public static void gcdGame() {
        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 1; i <= 3; i = i + 1) {

            var num1 = (int) (Math.floor(Math.random() * 100) + 1);
            var num2 = (int) (Math.floor(Math.random() * 100) + 1);

            System.out.println("Question: " + num1 + " " + num2);
            int answer = console.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == (getDivisor(num1, num2))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                        (getDivisor(num1, num2)) + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
