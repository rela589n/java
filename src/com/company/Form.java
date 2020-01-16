/*
 * Created by JFormDesigner on Thu Jan 16 12:25:23 EET 2020
 */

package com.company;

import java.awt.event.*;
import javax.swing.*;

import com.company.first.FirstHandler;
import com.company.second.SecondHandler;
import net.miginfocom.swing.*;

/**
 * @author hello
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        try {
            FirstHandler handler = new FirstHandler(this.textField1, this.textField2);
            JOptionPane.showMessageDialog(null, "Result: " + handler.run());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        SecondHandler handler = new SecondHandler(this.textField3, this.textField4, this.checkBox1);
        handler.run(this.textArea1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hello
        tabbedPane3 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        panel2 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        checkBox1 = new JCheckBox();
        textField4 = new JTextField();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[560,fill]" +
            "[fill]",
            // rows
            "[]" +
            "[273]" +
            "[]"));

        //======== tabbedPane3 ========
        {

            //======== panel1 ========
            {
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
                swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
                . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
                , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder
                () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
                . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
                ( ) ;} } );
                panel1.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[192,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Number:");
                panel1.add(label1, "cell 0 0 2 1");
                panel1.add(textField1, "cell 2 0 7 1");

                //---- label2 ----
                label2.setText("Power of root:");
                panel1.add(label2, "cell 0 1");
                panel1.add(textField2, "cell 2 1 7 1");

                //---- button1 ----
                button1.setText("text");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                panel1.add(button1, "cell 0 3");
            }
            tabbedPane3.addTab("First", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[28,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[209,fill]" +
                    "[223,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[55]"));

                //---- label3 ----
                label3.setText("Enter text:");
                panel2.add(label3, "cell 0 0 3 1");
                panel2.add(textField3, "cell 3 0 5 1");

                //---- checkBox1 ----
                checkBox1.setText("Write in file:");
                panel2.add(checkBox1, "cell 0 2 4 1");
                panel2.add(textField4, "cell 6 2");

                //---- button2 ----
                button2.setText("Run");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button2MouseClicked(e);
                    }
                });
                panel2.add(button2, "cell 7 2");

                //======== scrollPane1 ========
                {

                    //---- textArea1 ----
                    textArea1.setRows(4);
                    scrollPane1.setViewportView(textArea1);
                }
                panel2.add(scrollPane1, "cell 1 4 6 2");
            }
            tabbedPane3.addTab("Second", panel2);
        }
        contentPane.add(tabbedPane3, "cell 1 0 3 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hello
    private JTabbedPane tabbedPane3;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel2;
    private JLabel label3;
    private JTextField textField3;
    private JCheckBox checkBox1;
    private JTextField textField4;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
