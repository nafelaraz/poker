package com.argenti;

public enum Suit {

    D("Diamonds"),
    H("Hearts"),
    S("Spades"),
    C("Clubs");

    private String text;

    Suit(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
