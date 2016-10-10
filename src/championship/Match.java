package championship;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Match implements Evaluable<Integer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Match.class);

    private static int COUNTER = 1;

    private Participant playerOne;
    private Participant playerTwo;

    public Match(Participant playerOne, Participant playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Participant getWinner() {
        int playerOneNumber = playerOne.getNumber();
        int playerTwoNumber = playerTwo.getNumber();
        LOGGER.info("{} -> {}: {}, {}: {}", COUNTER, playerOne.getName(), playerOneNumber, playerTwo.getName(), playerTwoNumber);
        COUNTER++;
        return evaluate(playerOneNumber, playerTwoNumber);
    }

    @Override
    public Participant evaluate(Integer playerOneNumber, Integer playerTwoNumber) {
        return (playerOneNumber >= playerTwoNumber) ? playerOne : playerTwo;
    }

}
