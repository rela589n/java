package com.company.second;

public class CharsInformer {
    private String input;

    public CharsInformer(String str) {
        this.input = str;
    }

    public String run() {
        StringBuilder stringBuilder = new StringBuilder();
        int _i = 0;
        while (_i < input.length()) {
            char i = input.charAt(_i);
            stringBuilder.append(String.format("%s\tcode: %d\toctal: %s\thex: %s\n", i, (int) i, Integer.toOctalString(i), Integer.toHexString(i)));
            ++_i;
        }

        return stringBuilder.toString();
    }

}
