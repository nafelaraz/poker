package com.argenti.service.combination;

public enum HandCombination {

    HIGH_CARD(1, "Highest value card", new HighCard()),
    PAIR(2, "Two cards of same value", new Pair()),
    TWO_PAIRS(3, "Two different pairs",new TwoPairs()),
    THREE_OF_A_KIND(4, "Three cards of the same value", new ThreeOfAKind()),
    STRAIGHT(5, "All five cards in consecutive value order", new Straight()),
    FLUSH(6, "All five cards having the same suit", new Flush()),
    FULL_HOUSE(7, "Three of a kind and a Pair", new FullHouse()),
    FOUR_OF_A_KIND(8, "Four cards of the same value", new FourOfAKind()),
    STRAIGHT_FLUSH(9, "All five cards in consecutive value order, with the same suit", new StraightFlush()),
    ROYAL_FLUSH(10, "Ten, Jack, Queen, King and Ace in the same suit", new RoyalFlush());

    private int rank;
    private String description;
    private Combination combination;

    HandCombination(int rank, String description, Combination combination) {
        this.rank = rank;
        this.description = description;
        this.combination = combination;
    }


    public Combination getCombination() {
        return combination;
    }

    public int getRank() {
        return rank;
    }


    public String getDescription() {
        return description;
    }

}
