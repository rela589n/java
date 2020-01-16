package com.company;

public class Validator {
    private static Validator instance = null;

    private Validator() {
    }

    public static Validator getInstance() {
        if (instance == null) {
            instance = new Validator();
        }
        return instance;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }

        return true;
    }

    public boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
        } catch (NumberFormatException | NullPointerException e) {

            return false;
        }

        return true;
    }
}
