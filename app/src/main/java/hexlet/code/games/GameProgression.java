package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Cli.askName;

public class GameProgression {

    public static void progressionGame(){
        String name = askName();
        Scanner console = new Scanner(System.in);

        String progression1 = "2 4 6 8 10 12 14 16 18 20";
        String progression2 = "3 6 9 12 15 18 21 24 27 30";
        String progression3 = "4 8 12 16 20 24 28 32 36 40";

        System.out.println("What number is missing in the progression?");

        System.out.println(progression1.replace("10", ".."));
        int answer = console.nextInt();
        System.out.println("Your answer: " + answer);

        if (answer == 10) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                    "10" + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println(progression2.replace("21", ".."));
        answer = console.nextInt();
        System.out.println("Your answer: " + answer);

        if (answer == 21) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                    "21" + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println(progression3.replace("36", ".."));
        answer = console.nextInt();
        System.out.println("Your answer: " + answer);

        if (answer == 36) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                    "36" + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
