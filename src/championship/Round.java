package championship;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Round {

    private static final Logger LOGGER = LoggerFactory.getLogger(Round.class);

    private List<Participant> participants;

    public Round(List<Participant> participants) {
        LOGGER.info("New round started with {} participants.", participants.size());
        this.participants = participants;
    }

    public List<Participant> getResult() {
        List<Participant> winners = new ArrayList<>();
        if (participants.size() == 1) {
            Participant champion = participants.get(0);
            winners.add(champion);
        } else {
            List<Match> matches = createMatches();
            for (int i = 0; i < matches.size(); i++) {
                Participant winner = matches.get(i).getWinner();
                winners.add(winner);
            }
        }
        return winners;
    }

    private List<Match> createMatches() {
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < participants.size(); i += 2) {
            matches.add(new Match(participants.get(i), participants.get(i + 1)));
        }
        return matches;
    }

}
