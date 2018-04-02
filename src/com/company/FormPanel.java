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

        //Starting point for Grid Bag Layout
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        // initialization is MUST
        gc.weightx = 1;
        gc.weighty = 0.1;

        ///////////// First Row ///////////////////////
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        //gc.anchor = GridBagConstraints.LINE_START;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,5);
        add(nameLabel, gc);

        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        /////// Second Row //////////

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, gc);

        gc.gridy = 1;
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);

        ///////// Third Row ///////

        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0,0,0,0);
        add(okBtn, gc);
    }
}
