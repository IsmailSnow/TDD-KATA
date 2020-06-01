package org.isi.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {


    public static int sum(String given) {
        if (given.isEmpty()) {
            return 0;
        }
        return Arrays.asList(given.split(",")).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .stream().mapToInt(i -> i.intValue()).sum();
    }
}
