package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;
    private Toolbar toolbar;

    public MainFrame(){

        super("Hello World");

        setLayout(new BorderLayout());

        // componentns
        toolbar = new Toolbar();
        textPanel = new TextPanel();
        btn = new JButton("Click me!");

        toolbar.setTextPanel(textPanel);

        // adding components to Toolbar
        add(toolbar,BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
