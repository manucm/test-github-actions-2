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

    @Test
    void should_throw_exception_with_six_elements() {
        Assertions.assertThrows(RuntimeException.class, () ->
                calculator.sum(1,2,3,4,5,6
                ));
    }

    @Test
    void should_throw_exception_if_divide_by_zero() {
        Assertions.assertThrows(RuntimeException.class,
                () -> calculator.div(2, 0));
    }

    @Test
    void should_not_throw_exception_if_divice_by_2() {
        Double result = Assertions.assertDoesNotThrow(() -> calculator.div(4, 2));
        Assertions.assertEquals(2, result);
    }

}