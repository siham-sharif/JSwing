package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width=250;
        setPreferredSize(dim);

        //Adding Border
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);

        //combining two border
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

    }
}
