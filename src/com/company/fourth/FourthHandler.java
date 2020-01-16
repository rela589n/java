package com.company.fourth;

import com.company.ValidationException;
import com.company.Validator;

import javax.swing.*;
import java.io.File;

public class FourthHandler {
    private JTextField height;
    private JTextField width;
    private JTextField fName;
    private Validator validator = Validator.getInstance();

    public FourthHandler(JTextField height, JTextField width, JTextField fName) {
        this.height = height;
        this.width = width;
        this.fName = fName;
    }

    public void run(JTextField section) {
        String h = height.getText();
        String w = width.getText();
        String s = section.getText();
        String fileName = fName.getText().trim();

        try {
            if (!validator.isInteger(h)) {
                throw new ValidationException("Height must be decimal integer");
            }
            if (!validator.isInteger(w)) {
                throw new ValidationException("Width must be decimal integer");
            }

            if (!validator.isInteger(s)) {
                throw new ValidationException("Section must be decimal integer");
            }

            if (fileName.isEmpty()) {
                throw new ValidationException("File name could not be empty");
            }

            int area = Integer.parseInt(s);
            if (! (area >= 1 && area <= 4)) {
                throw new ValidationException("Section must be between 1 and 4");
            }

            FileMatrixReader reader = new FileMatrixReader(Integer.parseInt(h), Integer.parseInt(w), fileName);
            reader.read();

            int[][] matrix = reader.getMatrix();
            NegativeCountFinder finder = new NegativeCountFinder(matrix);

            JOptionPane.showMessageDialog(null, "Count: " +finder.findNegativeCount(area));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
