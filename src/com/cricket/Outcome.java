package com.cricket;

public enum Outcome {
    WICKET(0),ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),ZERO(0);

    private final int score;

    Outcome(int score) {
        this.score = score;
    }

    public int add(int score) {
        return score + this.score;
    }
}
