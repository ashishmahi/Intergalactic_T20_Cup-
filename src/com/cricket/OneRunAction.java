package com.cricket;

public class OneRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.ONE);
        players.swapFirstTwo();
    }
}
