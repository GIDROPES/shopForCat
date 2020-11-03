package com.javalesson.oop;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cat Shop");
        JLabel label = new JLabel("LEFT");
        frame.getContentPane().add(label, "West");
        frame.setSize(600,400 );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
