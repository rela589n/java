/*
 * Created by JFormDesigner on Thu Jan 16 12:25:23 EET 2020
 */

package com.company;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author hello
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
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

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[560,fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //======== tabbedPane3 ========
        {

            //======== panel1 ========
            {
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
                javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
                . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
                .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
                . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
                PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
                equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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
                panel1.add(button1, "cell 0 3");
            }
            tabbedPane3.addTab("First", panel1);
        }
        contentPane.add(tabbedPane3, "cell 0 0 3 2");
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
