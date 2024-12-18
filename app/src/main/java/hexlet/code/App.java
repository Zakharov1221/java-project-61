package hexlet.code;

import hexlet.code.games.GameGCD;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;
import hexlet.code.games.Cli;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 – Greet");
        System.out.println("2 – Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 – Exit");

        Scanner numberOfGame = new Scanner(System.in);
        String choice = numberOfGame.next();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "1":
                Cli.askName();
                break;

            case "2":
                GameEven.evenGame();
                break;

            case "3":
                GameCalc.calcGame();
                break;

            case "4":
                GameGCD.gcdGame();
                break;

            case "5":
                GameProgression.progressionGame();
                break;

            case "6":
                GamePrime.primeGame();
                break;

            case "0":
                break;

            default:
                System.out.println("Wrong command.");
                break;
            }
    }
}
