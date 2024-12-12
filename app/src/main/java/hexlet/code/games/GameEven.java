package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.games.Cli.askName;
import static hexlet.code.Engine.ROUND_COUNT;
import java.util.Scanner;

public class GameEven {

    public static boolean isEven(int randomNumber) {

        return randomNumber % 2 == 0;
}

    public static void evenGame(){

        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; i <= ROUND_COUNT; i++) {
            var randomNumber = (int) (Math.floor(Math.random() * 100) + 2);
            System.out.println("Question: " + randomNumber);
            String answer = console.next();
            System.out.println("Your answer: " + answer);

            var result = isEven(randomNumber) ? "yes" : "no";

            if (!Engine.gameChecker(answer, result, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        }
    }
