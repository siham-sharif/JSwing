package com.company;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {

    private JButton helloButton;
    private JButton goodByeButton;

    public Toolbar(){
        helloButton = new JButton("Hello");
        goodByeButton= new JButton("Goodbye");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodByeButton);
    }



}
