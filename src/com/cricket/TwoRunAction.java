package com.cricket;

public class TwoRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.TWO);
    }
}
