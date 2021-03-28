package hexlet.code.games;

/**
 * @author Gordeev Nikita
 * gordeevnm@gmail.com
 * 27.03.2021
 */
public interface Game {
    /**
     * start game.
     */
    void start();

    /**
     * @return game name to print in menu.
     */
    String getName();
}
