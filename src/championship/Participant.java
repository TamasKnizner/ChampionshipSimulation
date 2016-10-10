package championship;

import java.util.Random;

public class Participant {

    private String name;
    private Random random = new Random();

    public Participant(String name) {
        this.name = name;
    }

    public int getNumber() {
        return random.nextInt(1000);
    }

    public String getName() {
        return name;
    }

}
