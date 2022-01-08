package com.argenti.dto;


import com.argenti.Suit;

public class Card {
    private Suit suit;
    private int value;

    public Card() {
    }

    public Card(String str) {
        setCardValues(str);
    }

    private void setCardValues(String str) {
        if (str.length() < 2) {
            throw new RuntimeException("Card size is wrong!");
        }
        char c = str.charAt(0);
        char s = str.charAt(1);

        this.suit = Suit.valueOf(String.valueOf(s));

        if (c == 'T') {
            this.value = 10;
        } else if (c == 'J') {
            this.value = 11;
        } else if (c == 'Q') {
            this.value = 12;
        } else if (c == 'K') {
            this.value = 13;
        } else if (c == 'A') {
            this.value = 14;
        } else {
            this.value = Character.getNumericValue(c);
        }
    }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
