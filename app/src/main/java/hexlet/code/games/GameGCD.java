package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Cli.askName;
import static hexlet.code.Engine.*;
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

        for (int i = 1; i <= ROUND_COUNT; i++) {

            var num1 = (int) (Math.floor(Math.random() * 100) + 1);
            var num2 = (int) (Math.floor(Math.random() * 100) + 1);

            System.out.println("Question: " + num1 + " " + num2);
            var answer = console.next();
            System.out.println("Your answer: " + answer);

            var result = Integer.toString(getDivisor(num1, num2));

            if (!Engine.gameChecker(answer, result, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
