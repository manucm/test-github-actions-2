package com.manucm.githubactions.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringAccumulator {

    private static final int MAX_STRINGS = 10;

    public String acc(String...values) {
        if (values.length > MAX_STRINGS) {
            throw new RuntimeException("The maximum string allowed are " + MAX_STRINGS);
        }

        return Arrays.stream(values).collect(Collectors.joining("-"));
    }
}
