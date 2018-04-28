package com.cricket;

import java.util.Random;

public class KohliProbablity implements Result {
    @Override
    public Outcome getOutcome() {
        Outcome[] outcomes = Outcome.values();
        Random rand = new Random();
        int value = rand.nextInt(7);
        return outcomes[value];
    }
}
