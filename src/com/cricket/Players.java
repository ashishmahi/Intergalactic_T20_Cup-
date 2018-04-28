package com.cricket;


import java.util.ArrayList;
import java.util.Collections;

public class Players extends ArrayList<Player> {
    private ArrayList<Player> outBatsmen;

    public Players() {
        this.outBatsmen = new ArrayList<>();
    }

    public void swapFirstTwo() {
        Collections.swap(this,0,1);
    }

    public void out() {
        Player outPlayer = remove(0);
        outPlayer.updateScore(Outcome.WICKET);
        outBatsmen.add(outPlayer);
        if(!allOut()){
        Collections.swap(this,0,1);
        }
    }

    public boolean allOut() {
        return outBatsmen.size()==3;
    }
    public void nothing(){
        ArrayList<Player> all = new ArrayList<>();
        all.addAll(outBatsmen);
        all.addAll(this);
        all.stream().forEach(p-> System.out.println(p.score()));
    }

    public int totalScore() {
        ArrayList<Player> all = new ArrayList<>();
        all.addAll(outBatsmen);
        all.addAll(this);
        return all.stream().mapToInt(p->p.score()).sum();
    }

    public void visit(Visitor visitor) {
        ArrayList<Player> all = new ArrayList<>();
        all.addAll(outBatsmen);
        all.addAll(this);
        for (Player player : all) {
            player.visit(visitor);
        }
    }
}
