package com.company.third;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeChecker {

    private String withWidth(String input, int width, char emptySym) {
        String suffix = String.format("%" + width + "s", "").replace(' ', emptySym) + input;
        input = suffix.substring(input.length());

        return input;
    }

    public String run(BigInteger n) throws Exception {
        String result;
        if (n.isProbablePrime(20)) {
            result = String.format("%d is prime", n);
        } else {
            result = String.format("%d is not prime", n);
        }
        return withWidth(result, 20, '#');
    }
}
