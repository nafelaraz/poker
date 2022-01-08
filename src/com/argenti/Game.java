package com.argenti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) throws IOException {
        Player player1 = new Player();
        Player player2 = new Player();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = null;
        while( (x = input.readLine()) != null ) {
            List<String> firstHandList = new ArrayList<>();
            List<String> secondHandList = new ArrayList<>();
            String[] line = x.split(" ");
            for (String s : line) {
                if (firstHandList.size() < 5) {
                    firstHandList.add(s);
                } else {
                    secondHandList.add(s);
                    if (secondHandList.size() == 5) {

                        player1.setHand(firstHandList);
                        player2.setHand(secondHandList);

                        int comp = player1.getHand().getCombinationWithValue().compare(player2.getHand().getCombinationWithValue());
                        if (comp > 0) {
                            player1.increaseGameWon();
                            player2.increaseGameLost();
                        } else if (comp < 0) {
                            player2.increaseGameWon();
                            player1.increaseGameLost();
                        }
                    }
                }

            }
            //System.out.println(x);
        }

        System.out.println("Player 1: " + player1.getGameWon() + " hands");
        System.out.println("Player 2: " + player2.getGameWon() + " hands");
    }
}
