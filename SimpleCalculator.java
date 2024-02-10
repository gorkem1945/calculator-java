package com.arlasner.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextField firtstNumberField;
    private JLabel firstNumber;
    private JTextField secondNumberField;
    private JLabel secondNumber;
    private JLabel result;
    private JButton addButton;
    private JButton modButton;
    private JButton clearButton;
    private JTextField resultField;

    public SimpleCalculator() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstNumber = firtstNumberField.getText().trim();
                String secondNumber = secondNumberField.getText().trim();
                Double result = Double.parseDouble(firstNumber)+ Double.parseDouble(secondNumber);
                resultField.setText(result.toString());

            }


        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}