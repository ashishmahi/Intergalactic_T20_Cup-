package com.cricket;

public class ThreeRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.THREE);
        players.swapFirstTwo();
    }
}
