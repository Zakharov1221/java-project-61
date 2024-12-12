package hexlet.code;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void gameChecker(String answer, String result, String name) {

        if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        System.out.println("Congratulations, " + name + "!");
    }
}