package com.georgeisaev.faang.leetcode.alg.array.medium.reversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class EvaluateReversePolishNotationImpl implements EvaluateReversePolishNotation {

    private static final Map<String, IntBinaryOperator> OPERATORS =
            Map.of("+", Integer::sum,
                    "-", (a, b) -> a - b,
                    "*", (a, b) -> a * b,
                    "/", (a, b) -> a / b);

    @Override
    public int evalRPN(String[] tokens) {
        Deque<Integer> values = new LinkedList<>();
        for (String token : tokens) {
            if (!OPERATORS.containsKey(token)) {
                values.offerLast(Integer.parseInt(token));
            } else {
                IntBinaryOperator operator = OPERATORS.get(token);
                int secondNumber = values.pollLast();
                int firstNumber = values.pollLast();
                values.offerLast(operator.applyAsInt(firstNumber, secondNumber));
            }
        }
        return values.pollLast();
    }

}
