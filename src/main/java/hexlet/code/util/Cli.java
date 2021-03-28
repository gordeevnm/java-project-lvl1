package hexlet.code.util;

import java.util.Scanner;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 21.03.2021
 */
public final class Cli {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String username = "";

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = SCANNER.nextLine();
        System.out.printf("Hello, %s!%n", username);
    }

    public static void println(final String rules) {
        System.out.println(rules);
    }

    public static void print(final String rules) {
        System.out.print(rules);
    }

    public static String read() {
        return SCANNER.nextLine();
    }

    public static String username() {
        return username;
    }
}
