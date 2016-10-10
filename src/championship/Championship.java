package championship;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Championship {

    private static final Logger LOGGER = LoggerFactory.getLogger(Championship.class);

    private List<Participant> participants;

    public Championship(List<Participant> participants) {
        this.participants = participants;
    }

    public void doMagic() {
        if ((participants.size() & (participants.size() - 1)) != 0) {
            LOGGER.error("Participant number must be a power of 2!");
            LOGGER.error("Exiting...");
            return;
        }
        Round round = new Round(participants);
        List<Participant> winners = round.getResult();
        while (winners.size() > 1) {
            round = new Round(winners);
            winners = round.getResult();
        }
        LOGGER.info("Champion is {}", winners.get(0).getName());
    }

}
