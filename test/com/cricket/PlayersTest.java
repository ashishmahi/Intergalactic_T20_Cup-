package com.cricket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PlayersTest {

    private Player virat;
    private Player dhoni;
    private Player bumrah;
    private Player nehra;
    private Players players;

    @Before
    public void setUp() {
        virat = mock(Player.class);
        dhoni = mock(Player.class);
        bumrah = mock(Player.class);
        nehra = mock(Player.class);
        players = new Players();
        players.add(virat);
        players.add(dhoni);
        players.add(bumrah);
        players.add(nehra);
    }

    @Test
    public void swapFirstTwo() {
        players.swapFirstTwo();
        assertTrue(players.indexOf(virat)==1);
    }

    @Test
    public void shouldRemovePlayerWhenGetOut() {
        players.out();
        assertFalse(players.contains(virat));
    }

    @Test
    public void shouldAssertTrueWhenAllOut() {
        players.out();
        players.out();
        players.out();
        assertTrue(players.allOut());
    }
}