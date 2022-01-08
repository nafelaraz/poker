package com.argenti.service.combination;

import java.util.Map;
import java.util.Stack;

public class StraightFlush implements Combination{
    @Override
    public Stack<Integer> getValues(Map<Integer, Long> repeatingValuesMap) {
        Stack<Integer> values = new Stack<>();
        for (Map.Entry<Integer, Long> value : repeatingValuesMap.entrySet()) {
            values.push(value.getKey());
            break;
        }
        return values;
    }
}
