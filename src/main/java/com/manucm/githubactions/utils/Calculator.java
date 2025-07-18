package com.manucm.githubactions.utils;

import java.util.Arrays;

public class Calculator {

    private static final int MAX_ELEMENTS = 5;

    public int sum(int...values) {
        if (values.length > MAX_ELEMENTS) {
            throw new RuntimeException("Number of elements can´t be more than " + MAX_ELEMENTS);
        }
        return Arrays.stream(values).sum();
    }

    public double div(double d1, double d2) {
        if (d2 == 0) {
            throw new RuntimeException("A number can´t be divided by zero");
        }
        return d1/d2;
    }
}
