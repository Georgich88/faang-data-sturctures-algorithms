package com.georgeisaev.faang.leetcode.alg.array.medium;

import com.georgeisaev.faang.leetcode.alg.array.medium.reversepolishnotation.EvaluateReversePolishNotation;
import com.georgeisaev.faang.leetcode.alg.array.medium.reversepolishnotation.EvaluateReversePolishNotationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationImplTest {

    @Test
    void shouldEvaluate() {

        EvaluateReversePolishNotation algo = new EvaluateReversePolishNotationImpl();

        // Example 1:
        // Input: tokens = ["2","1","+","3","*"]
        // Output: 9
        // Explanation: ((2 + 1) * 3) = 9
        assertEquals(9, algo.evalRPN(new String[]{"2", "1", "+", "3", "*"}));

        // Example 2:
        // Input: tokens = ["4","13","5","/","+"]
        // Output: 6
        // Explanation: (4 + (13 / 5)) = 6
        assertEquals(6, algo.evalRPN(new String[]{"4", "13", "5", "/", "+"}));

    }

}