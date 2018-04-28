package com.cricket;

public class SixRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.SIX);
    }
}
