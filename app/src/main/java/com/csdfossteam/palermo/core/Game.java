package com.csdfossteam.palermo.core;

import com.csdfossteam.palermo.core.vote.PlayerVote;

/**
 * TODO doc
 *
 * @author Akritas Akritidis
 */
public class Game {

    public final Players players;
    public final Rules rules;

    public int turn;
    public Phase phase;

    public PlayerVote vote;

    public Game() {
        players = new Players();
        rules = Rules.STANDARD;

        turn = 1;
        phase = Phase.Day;

        vote = null;
    }

    public void nextPhase() {

        phase = phase.next(rules);
        if (phase.isFirst(rules)) {
            turn += 1;
        }
    }
}
