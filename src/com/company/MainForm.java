/*
 * Created by JFormDesigner on Thu Jan 16 11:49:24 EET 2020
 */

package com.company;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author hello
 */
public class MainForm extends JFrame {
    public MainForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hello
        frame1 = new JFrame();
        tabbedPane3 = new JTabbedPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[825,fill]",
                // rows
                "[163]"));

            //======== tabbedPane3 ========
            {

                //======== panel1 ========
                {
                    panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
                    . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
                    . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
                    Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
                    ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
                    public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
                    ) )) throw new RuntimeException( ); }} );
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
                        "[fill]",
                        // rows
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]"));

                    //---- label1 ----
                    label1.setText("Number:");
                    panel1.add(label1, "cell 0 0 2 1");
                    panel1.add(textField1, "cell 2 0");

                    //---- label2 ----
                    label2.setText("Power of root:");
                    panel1.add(label2, "cell 0 1");
                    panel1.add(textField2, "cell 2 1");
                }
                tabbedPane3.addTab("First", panel1);
            }
            frame1ContentPane.add(tabbedPane3, "cell 0 0");
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hello
    private JFrame frame1;
    private JTabbedPane tabbedPane3;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
