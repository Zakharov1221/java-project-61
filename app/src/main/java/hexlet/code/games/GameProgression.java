package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.games.Cli.askName;
import static hexlet.code.Engine.ROUND_COUNT;
import java.util.Scanner;

public class GameProgression {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int PROGRESSION_LENGTH = 10;

    public static void progressionGame() {
        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        for (int i = 1; i <= ROUND_COUNT; i++) {

            int step = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
            int index = Engine.getRandomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);

            StringBuilder progression = new StringBuilder();
            StringBuilder result = new StringBuilder();

            for (int j = 1; j < PROGRESSION_LENGTH; j++) {

                if (j == index) {
                    progression.append(" ").append("..");
                    result = new StringBuilder(Integer.toString(step * j));
                } else {
                    progression.append(" ").append(step * j);
                }
            }

            System.out.println("Question:" + progression);
            var answer = console.next();
            System.out.println("Your answer: " + answer);

            if (!Engine.gameChecker(answer, String.valueOf(result), name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

