package hexlet.code;

import java.util.Scanner;

public class Cli {

    public void askName() {

        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, " + name + ".");

    }
}
