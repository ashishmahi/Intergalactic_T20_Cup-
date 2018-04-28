package com.cricket;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.*;

public class KohliProbablityTest {
    @Test
    public void shouldGiveRandomOutcome() {
        assertThat(Arrays.asList(Outcome.values()),hasItem(new KohliProbablity().getOutcome()));
    }
}