package com.argenti.service.combination;

import java.util.Map;
import java.util.Stack;

public interface Combination {
    public Stack<Integer> getValues(Map<Integer, Long> repeatingValuesMap);
}
