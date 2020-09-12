package com.mizan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    private JFrame mainJFrame;

    private JTextField tfDisplay;

    private JButton[] btArrayNumPad;

    private JButton btEquals;
    private JButton btAdd;
    private JButton btSub;
    private JButton btMul;
    private JButton btDiv;
    private JButton btPoint;
    private JButton btBackSpace;
    private JButton btClearDisplay;

    Font baseFont;

    public Calculator()
    {
        baseFont = new Font("Arial", Font.BOLD, 35);
        initializeComponents();
        addComponents();
        setupComponentStyles();
        setupComponentListeners();
    }
    private void initializeComponents()
    {
        mainJFrame = new JFrame("Calculator");
        mainJFrame.setSize(350,500);

        tfDisplay = new JTextField();
        tfDisplay.setEditable(false);

        btArrayNumPad = new JButton[10];
        btArrayNumPad[0] = new JButton("0");
        btArrayNumPad[1] = new JButton("1");
        btArrayNumPad[2] = new JButton("2");
        btArrayNumPad[3] = new JButton("3");
        btArrayNumPad[4] = new JButton("4");
        btArrayNumPad[5] = new JButton("5");
        btArrayNumPad[6] = new JButton("6");
        btArrayNumPad[7] = new JButton("7");
        btArrayNumPad[8] = new JButton("8");
        btArrayNumPad[9] = new JButton("9");

        btEquals = new JButton("=");
        btAdd = new JButton("+");
        btSub = new JButton("-");
        btMul = new JButton("\u00d7");
        btDiv = new JButton("\u00f7");
        btPoint = new JButton(".");
        btBackSpace = new JButton("\u2190");
        btClearDisplay = new JButton("C");
    }

    private void addComponents()
    {
        mainJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout(5, 4, 5, 5);
        mainJFrame.setLayout(gl);

        mainJFrame.add(tfDisplay);
        mainJFrame.add(btClearDisplay);
        mainJFrame.add(btBackSpace);
        mainJFrame.add(btPoint);

        for(JButton jb : btArrayNumPad)
        {
            mainJFrame.add(jb);
        }
        mainJFrame.add(btEquals);
        mainJFrame.add(btAdd);
        mainJFrame.add(btSub);
        mainJFrame.add(btMul);
        mainJFrame.add(btDiv);

    }

    private void setupComponentStyles()
    {
        tfDisplay.setFont(baseFont);
        for (JButton jb : btArrayNumPad)
        {
            jb.setFont(baseFont);
        }
        btEquals.setFont(baseFont);
        btAdd.setFont(baseFont);
        btSub.setFont(baseFont);
        btMul.setFont(baseFont);
        btDiv.setFont(baseFont);
        btPoint.setFont(baseFont);
        btBackSpace.setFont(baseFont);
        btClearDisplay.setFont(baseFont);


    }
    private void setupComponentListeners()
    {
        numButtonsListener listenerForNumKeys = new numButtonsListener();
        for(JButton jb : btArrayNumPad)
        {
            jb.addActionListener(listenerForNumKeys);
        }

        operationButtonsListener listenerForOpKeys = new operationButtonsListener();
        btAdd.addActionListener(listenerForOpKeys);
        btMul.addActionListener(listenerForOpKeys);
        btDiv.addActionListener(listenerForOpKeys);

        btSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textOnDisplay = tfDisplay.getText();

                if(textOnDisplay.matches("^.*[-]$"))
                {
                    return;
                }
                if(textOnDisplay.matches("^[-][0-9]*[.]?[0-9]*[-+\u00d7\u00f7][-0-9.][0-9]*$"))
                {
                    return;
                }
                if(textOnDisplay.matches("^[0-9.][0-9]*[.]?[0-9]*[-+\u00d7\u00f7][-0-9.][0-9]*$"))
                {
                    return;
                }
                tfDisplay.setText(textOnDisplay + "-");
            }
        });

        btEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textOnDisplay = tfDisplay.getText();
                double operand1 = 0d, operand2 = 0d;
                boolean IsFirstOperandMinus = false;
                boolean IsSecondOperandMinus = false;
                String res = "";

                // if display is empty or only .,- then nothing happens on pressing =
                if(textOnDisplay.isEmpty() || textOnDisplay.equals(".") || textOnDisplay.equals("-"))
                {
                    return;
                }

                if(textOnDisplay.startsWith("-"))
                {
                    IsFirstOperandMinus = true;
//                    System.out.println("op 1 minus");
                    textOnDisplay = textOnDisplay.substring(1);
                }
                if(textOnDisplay.matches("^[0-9]*[.]?[0-9]*[+\u00d7\u00f7][-][0-9]*[.]?[0-9]*$"))
                {
                    IsSecondOperandMinus = true;
//                    System.out.println("op 2 minus");
                    int i = textOnDisplay.indexOf("-");
                    textOnDisplay = textOnDisplay.substring(0, i) + textOnDisplay.substring(i + 1);
                }

                // get the operands by splitting the string b/w operators -, +,*,/
                String[] operands = textOnDisplay.split("[-+\u00d7\u00f7]");


                if(operands.length != 2)
                {
                    return;
                }

                // try to parse the string of operands as double
                try
                {
                    operand1 = Double.parseDouble(operands[0]);
                    operand1 = IsFirstOperandMinus ? -operand1 : operand1; // change operand to its -ve
                    operand2 = Double.parseDouble(operands[1]);
                    operand2 = IsSecondOperandMinus ? -operand2 : operand2; // change operand to its -ve
                }
                catch (Exception e1)
                {
                    return;
                }

                if(textOnDisplay.contains("+"))
                {
                    res = String.valueOf((Math.round((operand1 + operand2) * 100000000D) / 100000000D));
                }
                else if(textOnDisplay.contains("-"))
                {
                    res = String.valueOf((Math.round((operand1 - operand2) * 100000000D) / 100000000D));
                }
                else if(textOnDisplay.contains("\u00d7"))
                {
                    res = String.valueOf((Math.round((operand1 * operand2) * 100000000D) / 100000000D));
                }
                else if(textOnDisplay.contains("\u00f7"))
                {
                    res = String.valueOf((Math.round((operand1 / operand2) * 100000000D) / 100000000D));
                    if(operand2 == 0 || operand2 == -0)
                    {
                        res = "\u221e"; // infinity sign
                    }
                }
                res = res.matches("^.*\\.0+$") ? res.substring(0, res.indexOf(".")) : res;
                tfDisplay.setText(res);
            }
        });
        btPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textOnDisplay = tfDisplay.getText();
                // only concatenate . if no "." is present or there are two operands
                if(!textOnDisplay.contains(".") || textOnDisplay.matches("^.*[-+\u00d7\u00f7][^.]*$"))
                {
                    tfDisplay.setText(textOnDisplay + ".");
                }
            }
        });
        btBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayString = tfDisplay.getText();
                if(!displayString.isEmpty()) {
                    displayString = displayString.substring(0, displayString.length() - 1);
                    tfDisplay.setText(displayString);
                }
            }
        });
        btClearDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfDisplay.setText("");
            }
        });
    }

    public void runApp()
    {
        mainJFrame.setVisible(true);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class numButtonsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String btText = ((JButton) e.getSource()).getText();
            tfDisplay.setText(tfDisplay.getText() + btText);
        }
    }

    class operationButtonsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String textOnDisplay = tfDisplay.getText();
            String btText = ((JButton) e.getSource()).getText();
            if((textOnDisplay.isEmpty() || textOnDisplay.matches("^[.]$")))
            {
//                System.out.println("Op_Match 1");
                return;
            }
            if(textOnDisplay.matches("^.*[-+\u00d7\u00f7]$"))
            {
//                System.out.println("Op_Match 2");
                return;
            }
            if(textOnDisplay.matches("^[-]?[0-9]*[.]?[0-9]*[+\u00d7\u00f7][-]?[0-9]*[.]?[0-9]*$"))
            {
//                System.out.println("Op_Match 3");
                return;
            }
            if(textOnDisplay.matches("^[-][0-9]*[.]?[0-9]*[-][0-9]*[.]?[0-9]*$"))
            {
//                System.out.println("Op_Match 4");
                return;
            }
            if(textOnDisplay.matches("^[0-9.][0-9]*[.]?[0-9]*[-][0-9]*[.]?[0-9]*$"))
            {
//                System.out.println("Op_Match 4");
                return;
            }
            tfDisplay.setText(textOnDisplay + btText);
        }
    }
}
