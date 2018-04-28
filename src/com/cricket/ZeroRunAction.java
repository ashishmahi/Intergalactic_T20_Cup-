package com.cricket;

public class ZeroRunAction implements Action {
    @Override
    public void execute(Players players){
        players.get(0).updateScore(Outcome.ZERO);
    }
}
