package com.argenti.service;

import com.argenti.dto.Card;
import com.argenti.dto.CombinationWithValue;
import com.argenti.dto.Hand;
import com.argenti.service.combination.HandCombination;

import java.util.*;
import java.util.stream.Collectors;

public class HandCombinationHelper {

    public static Hand getHand(List<String> list){
        List<Card> cards = getCardList(list);
        Hand hand = new Hand();
        hand.setCards(cards);
        Map<Integer, Long> repeatingValuesMap = new TreeMap<>(getRepeatingValues(cards));
        hand.setRepeatingValuesMap(repeatingValuesMap);
        CombinationWithValue combinationWithValue = new CombinationWithValue();
        combinationWithValue.setCombination(getCombinationByCards(cards, repeatingValuesMap));
        Stack<Integer> values = combinationWithValue.getCombination().getCombination().getValues(repeatingValuesMap);
        combinationWithValue.setValues(values);
        hand.setCombinationWithValue(combinationWithValue);

        return hand;
    }

    private static List<Card> getCardList(List<String> list){
        List<Card> cards = new ArrayList<>();
        for(String s:list){
            cards.add(new Card(s));
        }
        cards.sort(Comparator.comparingInt(Card::getValue));
        return cards;
    }

    private static HandCombination getCombinationByCards(List<Card> cards , Map<Integer, Long> repeatingValuesMap) {

        boolean straight = isStraight(cards);
        boolean sameSuit = isSameSuit(cards);


        if (straight) {
            if (sameSuit) {
                if (cards.get(0).getValue() == 10) {
                    return HandCombination.ROYAL_FLUSH;
                } else {
                    return HandCombination.STRAIGHT_FLUSH;
                }
            } else {
                return HandCombination.STRAIGHT;
            }
        } else if (sameSuit) {
            return HandCombination.FLUSH;
        } else if (repeatingValuesMap.size() == 2) {

            if (repeatingValuesMap.values().contains(4L)) {
                return HandCombination.FOUR_OF_A_KIND;
            } else {
                return HandCombination.FULL_HOUSE;
            }
        } else if (repeatingValuesMap.size() == 3) {
            if (repeatingValuesMap.values().contains(3L)) {
                return HandCombination.THREE_OF_A_KIND;
            } else {
                return HandCombination.TWO_PAIRS;
            }
        } else if (repeatingValuesMap.size() == 4) {
            return HandCombination.PAIR;
        } else {
            return HandCombination.HIGH_CARD;
        }
    }


    private static boolean isStraight(List<Card> cards) {
        Card c = cards.get(0);
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).getValue() - c.getValue() != 1) {
                return false;
            } else {
                c = cards.get(i);
            }
        }
        return true;
    }

    private static boolean isSameSuit(List<Card> cards) {
        return cards.stream().allMatch(card -> card.getSuit() == cards.get(0).getSuit());
    }

    private static Map<Integer, Long> getRepeatingValues(List<Card> cards) {
        return cards.stream().collect(Collectors.groupingBy(card -> card.getValue(), Collectors.counting()));
    }

}
