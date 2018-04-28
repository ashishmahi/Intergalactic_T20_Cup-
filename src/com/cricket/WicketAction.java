package com.cricket;

public class WicketAction implements Action {
    @Override
    public void execute(Players players) {
        if(!players.allOut()){
        players.out();
        }
    }
}
