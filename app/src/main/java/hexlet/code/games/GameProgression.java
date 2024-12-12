package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.games.Cli.askName;
import static hexlet.code.Engine.ROUND_COUNT;
import java.util.Scanner;

public class GameProgression {

    public static void progressionGame() {
        String name = askName();
        Scanner console = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        for (int i = 1; i <= ROUND_COUNT; i++) {
            int length = 10;
            int step = (int) (Math.floor(Math.random() * 10) + 1);
            int index = (int) (Math.floor(Math.random() * 10) + 1);

            StringBuilder progression = new StringBuilder();

            String result = null;
            for (int j = 1; j < length; j++) {
                if (j == index) {
                    progression.append(" ").append("..");
                    result = Integer.toString(step * j);
                } else {
                    progression.append(" ").append(step * j);
                }
            }

            System.out.println("Question:" + progression);
            var answer = console.next();
            System.out.println("Your answer: " + answer);

            if (!Engine.gameChecker(answer, result, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

