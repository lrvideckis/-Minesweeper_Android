package com.LukeVideckis.minesweeper_android.minesweeperStuff.tiles;


import com.LukeVideckis.minesweeper_android.minesweeperStuff.minesweeperHelpers.BigFraction;

public class TileWithProbability extends TileNoFlagsForSolver {

    public BigFraction mineProbability;

    public TileWithProbability() {
        super();
        mineProbability = new BigFraction(0);
    }
}
