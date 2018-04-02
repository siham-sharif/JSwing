package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;


    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width=250;
        setPreferredSize(dim);

        nameLabel = new JLabel("Name: ");
        occupationLabel = new JLabel("Occupation: ");
        nameField = new JTextField(10); // how many characters
        occupationField = new JTextField(10);

        okBtn = new JButton("OK");


        //Adding Border
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);

        //combining two border
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

    }
}
