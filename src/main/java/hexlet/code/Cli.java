package hexlet.code;

import java.util.Scanner;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 21.03.2021
 */
public class Cli {
    public static void dialogue() {
        final Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String name = s.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }
}
