package hexlet.code.games;

import java.util.Scanner;

public class Cli {

    public static String askName() {
        Scanner console = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = console.nextLine();
        System.out.println("Hello, " + name + "!");

        return name;
    }
}