package com.cricket;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InningTest {

    private Player kiratBoli;
    private Player nodhiNS;
    private Player rumrahR;
    private Player nehraA;
    private Players players;

    @Before
    public void setUp() {
        kiratBoli = new Player("Kirat Boli", new KohliProbablity());
        nodhiNS = new Player("NS Nodhi", new KohliProbablity());
        rumrahR = new Player("R Rumrah", new KohliProbablity());
        nehraA = new Player("Shashi Henra", new KohliProbablity());
        players = new Players();
        players.add(kiratBoli);
        players.add(nodhiNS);
        players.add(rumrahR);
        players.add(nehraA);
    }

    @Test
    public void shouldDoNothing() {
        Inning inning = new Inning(40, players, 4);
        inning.start();
        inning.details(new Visitor());
    }
}
