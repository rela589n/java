/*
 * Created by JFormDesigner on Thu Jan 16 12:25:23 EET 2020
 */

package com.company;

import java.awt.event.*;
import javax.swing.*;

import com.company.first.FirstHandler;
import com.company.fourth.FourthHandler;
import com.company.second.SecondHandler;
import com.company.third.ThirdHandler;
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

    private void button3MouseClicked(MouseEvent e) {
        ThirdHandler handler = new ThirdHandler(textField5);
        handler.handle();
    }

    private void button4MouseClicked(MouseEvent e) {
        FourthHandler handler = new FourthHandler(textField6, textField7, textField8);
        handler.run(textField9);
    }

    private void button5MouseClicked(MouseEvent e) {
        
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
        panel3 = new JPanel();
        label4 = new JLabel();
        textField5 = new JTextField();
        button3 = new JButton();
        panel4 = new JPanel();
        label5 = new JLabel();
        textField6 = new JTextField();
        label6 = new JLabel();
        textField7 = new JTextField();
        label7 = new JLabel();
        textField8 = new JTextField();
        label8 = new JLabel();
        textField9 = new JTextField();
        button4 = new JButton();
        panel5 = new JPanel();
        label9 = new JLabel();
        textField10 = new JTextField();
        button5 = new JButton();

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
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
                . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
                . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
                awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
                ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
                ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
                ;
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

            //======== panel3 ========
            {
                panel3.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[106,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label4 ----
                label4.setText("Enter number:");
                panel3.add(label4, "cell 0 1");
                panel3.add(textField5, "cell 2 1 8 1");

                //---- button3 ----
                button3.setText("Check for primaty");
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button3MouseClicked(e);
                    }
                });
                panel3.add(button3, "cell 5 3");
            }
            tabbedPane3.addTab("Third", panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[229,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label5 ----
                label5.setText("Enter matrix height:");
                panel4.add(label5, "cell 0 0");
                panel4.add(textField6, "cell 2 0");

                //---- label6 ----
                label6.setText("Enter matrix width:");
                panel4.add(label6, "cell 0 1");
                panel4.add(textField7, "cell 2 1");

                //---- label7 ----
                label7.setText("Enter file name to read:");
                panel4.add(label7, "cell 0 3");
                panel4.add(textField8, "cell 2 3");

                //---- label8 ----
                label8.setText("Enter section index:");
                panel4.add(label8, "cell 0 5");
                panel4.add(textField9, "cell 2 5");

                //---- button4 ----
                button4.setText("Find quantity");
                button4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button4MouseClicked(e);
                    }
                });
                panel4.add(button4, "cell 6 5");
            }
            tabbedPane3.addTab("Fourth", panel4);

            //======== panel5 ========
            {
                panel5.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[158,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label9 ----
                label9.setText("Enter file name to read from: ");
                panel5.add(label9, "cell 1 0");
                panel5.add(textField10, "cell 3 0 3 1");

                //---- button5 ----
                button5.setText("Count rectangles");
                button5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button5MouseClicked(e);
                    }
                });
                panel5.add(button5, "cell 1 3 4 1");
            }
            tabbedPane3.addTab("Fifth", panel5);
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
    private JPanel panel3;
    private JLabel label4;
    private JTextField textField5;
    private JButton button3;
    private JPanel panel4;
    private JLabel label5;
    private JTextField textField6;
    private JLabel label6;
    private JTextField textField7;
    private JLabel label7;
    private JTextField textField8;
    private JLabel label8;
    private JTextField textField9;
    private JButton button4;
    private JPanel panel5;
    private JLabel label9;
    private JTextField textField10;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
