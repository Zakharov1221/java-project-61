package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 – Greet");
        System.out.println("2 – Even");
        System.out.println("3 - Calc");
        System.out.println("0 – Exit");

        Scanner numberOfGame = new Scanner(System.in);
        int choice = numberOfGame.nextInt();

        System.out.println("Your choice " + choice);

        switch (choice) {
            case 1:
                Cli.askName();
                break;

            case 2:
                Cli.evenGame();
                break;

            case 3:
                Engine.calcGame();
                break;

            case 0:
                break;

            default:
                System.out.println("Wrong command.");
                break;
            }
    }
}