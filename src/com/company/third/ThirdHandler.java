package com.company.third;

import com.company.Validator;

import javax.swing.*;
import java.math.BigInteger;

public class ThirdHandler {
    private String text;
    private PrimeChecker primeChecker;
    private Validator validator = Validator.getInstance();

    public ThirdHandler(JTextField field) {
        this.text = field.getText();
        primeChecker = new PrimeChecker();
    }

    public void handle() {
        BigInteger source;
        if (!validator.isInteger(text)) {
            JOptionPane.showMessageDialog(null, "Please, enter valid integer value");
            return;
        }
        source = new BigInteger(text);

        try {
            JOptionPane.showMessageDialog(null, primeChecker.run(source));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
