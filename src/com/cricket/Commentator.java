package com.cricket;

import java.util.ArrayList;

public class Commentator {
    private ArrayList<String> commentary;

    public Commentator() {
        this.commentary = new ArrayList<>();
    }

    public void commentFor(Player player, Outcome outcome, String overs) {
        if(outcome.equals(Outcome.WICKET)){
            commentary.add(overs + " " + player + " gets out!");
            return;
        }
        commentary.add( overs +" "+ player + " scores " + outcome);
    }

    public void showCommentary() {
        for (String s : commentary) {
            System.out.println(s);
        }
    }

    public void commentLost() {
        commentary.add("lost");
    }

    public void commentWon() {
        commentary.add("won");
    }

    public void commentForOver(int oversLeft, int runsNeeded) {
        commentary.add( "\n"+oversLeft +" overs left. " +runsNeeded +" runs to win.\n");
    }
}
