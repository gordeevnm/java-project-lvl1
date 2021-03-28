package hexlet.code;

import java.util.Scanner;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 21.03.2021
 */
public class Cli {
    private static final Scanner s = new Scanner(System.in);
    private static String username = "";

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = s.nextLine();
        System.out.printf("Hello, %s!%n", username);
    }

    public static void println(String rules) {
        System.out.println(rules);
    }

    public static void print(String rules) {
        System.out.print(rules);
    }

    public static String read() {
        return s.nextLine();
    }

    public static String username() {
        return username;
    }
}
