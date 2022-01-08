package com.argenti.service.combination;

import java.util.Map;
import java.util.Stack;

public class Flush implements Combination {
    @Override
    public Stack<Integer> getValues(Map<Integer, Long> repeatingValuesMap) {

        Stack<Integer> values = new Stack<>();
        for (Integer i : repeatingValuesMap.keySet()) {
            values.push(i);
        }
        return values;
    }
}
