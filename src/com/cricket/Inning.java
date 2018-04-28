package com.cricket;

import java.util.HashMap;

import static com.cricket.Outcome.*;

public class Inning {
    private final int target;
    private final Players players;
    private int overs;
    private final HashMap<Outcome, Action> actions;
    private final Commentator commentator;

    public Inning(int target, Players players, int overs) {
        this.target = target;
        this.players = players;
        this.overs = overs;
        this.actions = new HashMap<>();
        this.commentator = new Commentator();

    }

    private void addAction() {
        actions.put(ONE, new OneRunAction());
        actions.put(TWO, new TwoRunAction());
        actions.put(THREE, new ThreeRunAction());
        actions.put(FOUR, new FourRunAction());
        actions.put(FIVE, new FiveRunAction());
        actions.put(SIX, new SixRunAction());
        actions.put(ZERO, new ZeroRunAction());
        actions.put(WICKET, new WicketAction());
    }

    public void start() {
        addAction();
        for (int over = 0; over < overs; over++) {
            for (int balls = 1; balls < 7; balls++) {
                playBall(over, balls);
                if (players.allOut()) {
                    commentator.commentLost();
                    return;
                }
                if (won()) {
                    commentator.commentWon();
                    return;
                }
            }
            int runsNeeded = target - players.totalScore();
            commentator.commentForOver(overs - (over+1), runsNeeded);
        }
        commentator.commentLost();
    }

    private boolean won() {
        return players.totalScore() >= target;
    }

    private void playBall(int over, int ball) {
        Player player = players.get(0);
        Outcome outcome = player.getOutcome();
        Action action = actions.get(outcome);
        action.execute(players);
        commentator.commentFor(player, outcome, String.format("%d.%d", over, ball));
    }

    private void visit(Visitor visitor) {
        players.visit(visitor);
    }

    public void details(Visitor visitor) {
        visit(visitor);
        visitor.print();
        commentator.showCommentary();
    }
}
