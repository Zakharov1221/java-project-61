package hexlet.code;

import java.util.Scanner;

public class Cli {
    static Scanner console = new Scanner(System.in);

    public static String askName() {

        System.out.println("May I have your name? ");
        String name = console.nextLine();
        System.out.println("Hello, " + name + ".");

        return name;
    }
}