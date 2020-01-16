package com.company.first;

import com.company.Form;
import com.company.ValidationException;
import com.company.Validator;

import javax.swing.*;


public class FirstHandler {
    private double number;
    private int power;

    private Validator validator = Validator.getInstance();

    public FirstHandler(JTextField number, JTextField power) throws ValidationException {
        String n = number.getText();
        String p = power.getText();

        if (!validator.isFloat(n) || !validator.isInteger(p)) {
            throw new ValidationException("Number must be int. Power must be float.");
        }

        this.number = Double.parseDouble(n);
        this.power = Integer.parseInt(p);
    }

    public double run() throws Exception {
        return (new RootFinder()).mySqrt(number, power);
    }
}
