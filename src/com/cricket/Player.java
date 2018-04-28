package com.cricket;

public class Player {
    private final String name;
    private final Result probability;
    private int score = 0;
    private int ballPlayed = 0;

    public Player(String name, Result probability) {
        this.name = name;
        this.probability = probability;
    }

    public Outcome getOutcome() {
        return probability.getOutcome();
    }

    public void updateScore(Outcome outcome) {
        this.score = outcome.add(this.score);
        this.ballPlayed++;
    }

    public int score() {
        return score;
    }

    @Override
    public String toString() {
        return name;
    }

    public void visit(Visitor visitor) {
        visitor.acceptPlayer(name,score,ballPlayed);
    }
}
