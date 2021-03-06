package com.csdfossteam.palermo.core;

import java.io.Serializable;

/**
 * The turn and phase of the game.
 *
 * @author Akritas Akritidis
 */
public final class Turn implements Serializable {

    public int turn;
    public Phase phase;

    public Turn() {
        turn = 0;
        phase = Phase.Day;
    }

    public void nextPhase(Rules rules) {

        phase = phase.next(rules);
        if (phase.isFirst(rules)) {
            turn += 1;
        }
    }

}
