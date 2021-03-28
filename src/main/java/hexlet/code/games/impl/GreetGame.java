package hexlet.code.games.impl;

import hexlet.code.games.Game;
import hexlet.code.util.Cli;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public final class GreetGame implements Game {
    @Override
    public void start() {
        Cli.greet();
    }

    @Override
    public String getName() {
        return "Greet";
    }
}
