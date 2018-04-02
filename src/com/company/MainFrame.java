package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame(){

        super("Hello World");

        setLayout(new BorderLayout());

        // componentns
        toolbar = new Toolbar();
        textPanel = new TextPanel();
        formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener(){
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        // adding components to Toolbar
        add(formPanel, BorderLayout.WEST);
        add(toolbar,BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        //default constructor value
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
