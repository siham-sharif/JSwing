package com.company;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width=250;
        setPreferredSize(dim);

    }
}
