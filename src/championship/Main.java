package championship;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Participant p1 = new Participant("M�snapos B�la");
        Participant p2 = new Participant("Gyul�m");
        Participant p3 = new Participant("M�snapos Gyul�m");
        Participant p4 = new Participant("B�l�m");
        Participant p5 = new Participant("M�snapos G�za");
        Participant p6 = new Participant("Marcsim");
        Participant p7 = new Participant("M�snapos Marcsi");
        Participant p8 = new Participant("G�z�m");
        List<Participant> participants = new ArrayList<>();
        participants.add(p1);
        participants.add(p2);
        participants.add(p3);
        participants.add(p4);
        participants.add(p5);
        participants.add(p6);
        participants.add(p7);
        participants.add(p8);
        new Championship(participants).doMagic();
    }

}
