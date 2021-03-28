package hexlet.code.games;

import hexlet.code.Cli;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public class GreetGame implements Game {
    @Override
    public void start() {
        Cli.greet();
    }

    @Override
    public String getName() {
        return "Greet";
    }
}
