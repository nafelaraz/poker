package com.argenti.dto;

import com.argenti.service.combination.HandCombination;

import java.util.Stack;

public class CombinationWithValue {
    private HandCombination combination;
    private Stack<Integer> values;

    public CombinationWithValue() {

    }

    public HandCombination getCombination() {
        return combination;
    }

    public void setCombination(HandCombination combination) {
        this.combination = combination;
    }

    public Stack<Integer> getValues() {
        return values;
    }

    public void setValues(Stack<Integer> values) {
        this.values = values;
    }

    public int compare(CombinationWithValue otherCombination) {
        if (this.combination.getRank() == otherCombination.combination.getRank()) {
            while (!this.values.empty()) {
                int value = this.values.pop();
                int otherValue = otherCombination.values.pop();
                if (value != otherValue) {
                    return value - otherValue;
                }
            }
            return 0;
        } else {
            return this.combination.getRank() - otherCombination.combination.getRank();
        }
    }
}
