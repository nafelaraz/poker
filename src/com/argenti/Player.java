package com.argenti;

import com.argenti.dto.Hand;
import com.argenti.service.HandCombinationHelper;

import java.util.List;

public class Player {
    private Hand hand;
    private int gameWon = 0;
    private int gameLost = 0;

    public Player() {
    }

    public void setHand(List<String> list) {
        hand = HandCombinationHelper.getHand(list);
    }

    public void increaseGameWon() {
        gameWon++;
    }

    public void increaseGameLost() {
        gameLost++;
    }

    public int getGameWon() {
        return gameWon;
    }

    public int getGameLost() {
        return gameLost;
    }

    public Hand getHand() {
        return hand;
    }
}
