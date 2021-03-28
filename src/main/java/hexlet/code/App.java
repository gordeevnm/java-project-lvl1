package hexlet.code;

import hexlet.code.games.impl.CalcGame;
import hexlet.code.games.Game;
import hexlet.code.games.impl.GcdGame;
import hexlet.code.games.impl.GreetGame;
import hexlet.code.games.impl.IsEvenGame;
import hexlet.code.games.impl.PrimeGame;
import hexlet.code.games.impl.ProgressionGame;
import hexlet.code.util.Cli;

public class App {
    private static final Game[] GAMES = new Game[]{
            new GreetGame(),
            new IsEvenGame(),
            new CalcGame(),
            new GcdGame(),
            new ProgressionGame(),
            new PrimeGame()
    };

    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 0; i < GAMES.length; i++) {
            final Game game = GAMES[i];
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
            if (gameNum < 1 || gameNum > GAMES.length) {
                Cli.println("Invalid input");
                return;
            }

            GAMES[gameNum - 1].start();
        } catch (NumberFormatException e) {
            Cli.println("Invalid input");
        }
    }
}
