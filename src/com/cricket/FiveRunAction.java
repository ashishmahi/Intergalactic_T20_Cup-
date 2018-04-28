package com.cricket;

public class FiveRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.FIVE);
        players.swapFirstTwo();
    }
}
