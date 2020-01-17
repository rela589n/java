package com.company.fifth;

import com.company.ValidationException;

import javax.swing.*;
import java.io.IOException;

public class FifthHandler {
    private JTextField fileName;

    public FifthHandler(JTextField fileName) {
        this.fileName = fileName;
    }

    public void run() {
        String file = fileName.getText();
        RectanglesFinder finder = new RectanglesFinder(file);

        try {
            JOptionPane.showMessageDialog(null, "Count: " + finder.run());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
