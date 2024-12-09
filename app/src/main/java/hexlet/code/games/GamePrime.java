package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Cli.askName;
import static hexlet.code.Engine.*;
import java.util.Scanner;

public class GamePrime {

    public static boolean isPrime(int randomNumber) {

        if (randomNumber < 2) {
            return false;
        }
        for (var i = 2; i <= randomNumber / 2; i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {

        String name = askName();
        Scanner console= new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 1; i <= ROUND_COUNT; i++) {
            var randomNumber = (int) (Math.floor(Math.random() * 100) + 2);
            System.out.println("Question:" + randomNumber);
            String answer = console.next();
            System.out.println("Your answer: " + answer);

            var result = isPrime(randomNumber) ? "yes" : "no";

            Engine.gameChecker(answer, result, name);
        }
    }
}
