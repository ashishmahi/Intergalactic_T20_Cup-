package com.cricket;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("xyz", new KohliProbablity());
    }

    @Test
    public void shouldGiveOutcome() {
        assertThat(Arrays.asList(Outcome.values()),hasItem(player.getOutcome()));
    }

    @Test
    public void shouldIncreaseScore() {
        player.updateScore(Outcome.FOUR);
        assertThat(player.score(),is(4));
    }
}