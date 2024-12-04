package hexlet.code.games;

import static hexlet.code.Cli.askName;
import java.util.Scanner;

public class GameEven {

    public static boolean isEven(int randomNumber) {

        if (randomNumber % 2 == 0) {
            return true;
        } else {
        return false;
        }
}

    public static void evenGame(){

        String name = askName();
        Scanner console= new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 1; i <= 3; i = i + 1) {
            var randomNumber = (int) (Math.floor(Math.random() * 100) + 2);
            System.out.println("Question:" + randomNumber);
            String answer = console.next();
            System.out.println("Your answer: " + answer);

            var result = isEven(randomNumber) ? "yes" : "no";

            if (answer.equals(result))
            {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                        result + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
