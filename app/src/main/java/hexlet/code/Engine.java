package hexlet.code;

public class Engine {
    public static final int ROUND_COUNT = 3;


    public static boolean gameChecker(String answer, String result, String name) {

        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
    }

    public static int getRandomNumber(int max, int min) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
