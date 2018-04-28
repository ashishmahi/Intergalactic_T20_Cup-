package com.cricket;

import java.util.ArrayList;

public class Visitor {
    private ArrayList<String> details;

    public Visitor() {
        details = new ArrayList<>();
    }

    public void acceptPlayer(String name, int score, int ballPlayed) {
        details.add(name+" - " + score + "("+ballPlayed+" balls)");
    }

    public void print() {
        for (String detail : details) {
            System.out.println(detail);
        }
        System.out.println("\n");
    }
}
