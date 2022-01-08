package com.argenti.service.combination;

import java.util.Map;
import java.util.Stack;

public class TwoPairs implements Combination{
    @Override
    public Stack<Integer> getValues(Map<Integer, Long> repeatingValuesMap) {
        Stack<Integer> values = new Stack<>();

        for (Map.Entry<Integer,Long> value : repeatingValuesMap.entrySet()) {
            if(value.getValue()==1L){
                values.push(value.getKey());
                break;
            }
        }
        for (Map.Entry<Integer,Long> value : repeatingValuesMap.entrySet()) {
            if(value.getValue()==2L){
                values.push(value.getKey());
            }
        }
        return values;
    }
}
