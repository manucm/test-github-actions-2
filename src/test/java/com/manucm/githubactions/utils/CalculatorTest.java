package com.manucm.githubactions.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private static final Calculator calculator = new Calculator();

    @Test
    void should_be_10() {
        int sum = calculator.sum(2, 3, 3, 2);

        Assertions.assertEquals(10, sum);
    }

}