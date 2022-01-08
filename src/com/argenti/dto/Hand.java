package com.argenti.dto;

import com.argenti.dto.Card;
import com.argenti.dto.CombinationWithValue;

import java.util.*;

public class Hand {
    private List<Card> cards;

    private CombinationWithValue combinationWithValue = new CombinationWithValue();
    private Map<Integer, Long> repeatingValuesMap;


    public CombinationWithValue getCombinationWithValue() {
        return combinationWithValue;
    }

    public void setCombinationWithValue(CombinationWithValue combinationWithValue) {
        this.combinationWithValue = combinationWithValue;
    }

    public Map<Integer, Long> getRepeatingValuesMap() {
        return repeatingValuesMap;
    }

    public void setRepeatingValuesMap(Map<Integer, Long> repeatingValuesMap) {
        this.repeatingValuesMap = repeatingValuesMap;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
