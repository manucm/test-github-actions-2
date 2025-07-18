package com.manucm.githubactions.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringAccumulatorTest {

    private static final StringAccumulator accumulator = new StringAccumulator();

    @Test
    void should_acc() {
        String acc = accumulator.acc("Guillermo", "Nico");

        Assertions.assertEquals("Guillermo-Nico", acc);
    }

}