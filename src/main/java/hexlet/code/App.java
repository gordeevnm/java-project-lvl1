package hexlet.code;

import hexlet.code.games.*;

public class App {
    private static final Game[] games = new Game[]{
            new GreetGame(),
            new IsEvenGame(),
            new CalcGame(),
            new GcdGame(),
            new ProgressionGame()
    };

    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 0; i < games.length; i++) {
            final Game game = games[i];
            Cli.println((i + 1) + " - " + game.getName());
        }
        Cli.println("0 - Exit"); // FIXME 27.03.2021: empty game (?)
        Cli.print("Your choice: ");
        final String input = Cli.read();
        try {
            final int gameNum = Integer.parseInt(input);
            if (gameNum == 0) {
                return;
            }
            if (gameNum < 1 || gameNum > games.length) {
                Cli.println("Invalid input");
                return;
            }

            games[gameNum - 1].start();
        } catch (NumberFormatException e) {
            Cli.println("Invalid input");
        }
    }
}
