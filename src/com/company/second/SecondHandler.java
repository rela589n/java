package com.company.second;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class SecondHandler {
    private String source;
    private String fileName;
    private boolean needWrite;

    public SecondHandler(JTextField line, JTextField file, JCheckBox writeInFile) {
        source = line.getText();
        fileName = file.getText();
        needWrite = writeInFile.isSelected();
    }

    public void run(JTextArea writeInto)  {
        CharsInformer informer = new CharsInformer(source);
        String res = informer.run();

        if (needWrite) {
            try {
                write(res);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
        }

        writeInto.setText(res);
    }

    private void write(String what) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        writer.write(what);
        writer.close();
    }
}
