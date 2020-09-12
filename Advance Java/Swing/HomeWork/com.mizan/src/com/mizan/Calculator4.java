package com.mizan;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class Calculator4 extends JFrame{

    private JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero, Decimal, Add, Subtract, Divide, Multiple, Equal, Clear, Parentheses;
    private JLabel Total;

    private Double CalTotal = 0.0;
    private int ButtonPresses = 0;
    private Double WholeNumber = 0.0;
    private Double NumberStorage = 0.0;
    private Double DecimalNumber = 0.0;
    private char symbol;
    private char place;
    private int DecimalPlace = 10;
    private int EqualVar = 0;

    DecimalFormat df = new DecimalFormat(".######");

    public Calculator4() {

        createView();

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(298, 355);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.gray);
        getContentPane().add(panel);

        Total = new JLabel();
        Total.setBounds(5, 20, 480, 35);
        Total.setFont(new Font("", Font.BOLD, 21));
        panel.add(Total);
        updateTotal();

        Double [] array = new Double[60];

        One = new JButton("1");
        One.setBounds(0, 55, 100, 50);
        One.setFont(new Font("", Font.ITALIC, 20));
        One.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 1.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(One);

        Two = new JButton("2");
        Two.setBounds(95, 55, 100, 50);
        Two.setFont(new Font("", Font.ITALIC, 20));
        Two.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 2.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Two);

        Three = new JButton("3");
        Three.setBounds(0, 100, 100, 50);
        Three.setFont(new Font("", Font.ITALIC, 20));
        Three.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 3.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Three);

        Four = new JButton("4");
        Four.setBounds(95, 100, 100, 50);
        Four.setFont(new Font("", Font.ITALIC, 20));
        Four.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 4.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Four);

        Five = new JButton("5");
        Five.setBounds(0, 145, 100, 50);
        Five.setFont(new Font("", Font.ITALIC, 20));
        Five.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 5.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Five);

        Six = new JButton("6");
        Six.setBounds(95, 145, 100, 50);
        Six.setFont(new Font("", Font.ITALIC, 20));
        Six.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 6.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Six);

        Seven = new JButton("7");
        Seven.setBounds(0, 190, 100, 50);
        Seven.setFont(new Font("", Font.ITALIC, 20));
        Seven.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 7.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Seven);

        Eight = new JButton("8");
        Eight.setBounds(95, 190, 100, 50);
        Eight.setFont(new Font("", Font.ITALIC, 20));
        Eight.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 8.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Eight);

        Nine = new JButton("9");
        Nine.setBounds(0, 235, 100, 50);
        Nine.setFont(new Font("", Font.ITALIC, 20));
        Nine.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 9.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Nine);

        Zero = new JButton("0");
        Zero.setBounds(95, 235, 100, 50);
        Zero.setFont(new Font("", Font.ITALIC, 20));
        Zero.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        array [ButtonPresses] = 0.0;
                        if (place != '.') {
                            WholeNumber = 0.0;
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                WholeNumber = (WholeNumber * 10) + array[x];
                            }
                        }
                        if (place == '.') {
                            DecimalNumber = 0.0;
                            for (int x = 0; x <= ButtonPresses; x++) {
                                DecimalNumber = (DecimalNumber + (array [x] / DecimalPlace));
                                DecimalPlace = (DecimalPlace * 10);
                            }
                        }
                        DecimalPlace = 10;
                        CalTotal = (WholeNumber + DecimalNumber);
                        ButtonPresses++;
                        updateTotal();
                    }
                }
        );
        panel.add(Zero);

        Equal = new JButton("=");
        Equal.setBounds(195, 283, 100, 43);
        Equal.setFont(new Font("", Font.ITALIC, 20));
        Equal.setBackground(Color.green);
        Equal.setBorderPainted(false);
        Equal.setOpaque(true);
        Equal.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (symbol == '+') {
                            CalTotal = (NumberStorage + CalTotal);
                        }
                        if (symbol == '-') {
                            CalTotal = (NumberStorage - CalTotal);
                        }
                        if (symbol == '/') {
                            CalTotal = (NumberStorage / CalTotal);
                        }
                        if (symbol == '*') {
                            CalTotal = (NumberStorage * CalTotal);
                        }
                        ButtonPresses = 0;
                        EqualVar = 1;
                        updateTotal();
                    }
                }
        );
        panel.add(Equal);

        Parentheses = new JButton("( )");
        Parentheses.setBounds(95, 280, 100, 50);
        Parentheses.setFont(new Font("", Font.ITALIC, 20));
        Parentheses.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                }
        );
        panel.add(Parentheses);

        Decimal = new JButton(".");
        Decimal.setBounds(0, 280, 100, 50);
        Decimal.setFont(new Font("", Font.ITALIC, 20));
        Decimal.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        place = '.';
                        ButtonPresses = 0;

                    }
                }
        );
        panel.add(Decimal);

        Add = new JButton("+");
        Add.setBounds(195, 58, 100, 43);
        Add.setFont(new Font("", Font.ITALIC, 20));
        Add.setBackground(Color.ORANGE);
        Add.setBorderPainted(false);
        Add.setOpaque(true);
        Add.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ButtonPresses > 0 || EqualVar == 1) {
                            NumberStorage = CalTotal;
                        }
                        ButtonPresses = 0;
                        EqualVar = 0;
                        WholeNumber = 0.0;
                        CalTotal = 0.0;
                        symbol = '+';
                        place = 'c';
                        updateTotal();

                    }
                }
        );
        panel.add(Add);

        Subtract = new JButton("-");
        Subtract.setBounds(195, 103, 100, 43);
        Subtract.setFont(new Font("", Font.ITALIC, 20));
        Subtract.setBackground(Color.ORANGE);
        Subtract.setBorderPainted(false);
        Subtract.setOpaque(true);
        Subtract.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ButtonPresses > 0 || EqualVar == 1) {
                            NumberStorage = CalTotal;
                        }
                        ButtonPresses = 0;
                        EqualVar = 0;
                        WholeNumber = 0.0;
                        CalTotal = 0.0;
                        symbol = '-';
                        place = 'c';
                        updateTotal();

                    }
                }
        );
        panel.add(Subtract);

        Divide = new JButton("/");
        Divide.setBounds(195, 148, 100, 43);
        Divide.setFont(new Font("", Font.ITALIC, 20));
        Divide.setBackground(Color.ORANGE);
        Divide.setBorderPainted(false);
        Divide.setOpaque(true);
        Divide.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ButtonPresses > 0 || EqualVar == 1) {
                            NumberStorage = CalTotal;
                        }
                        ButtonPresses = 0;
                        EqualVar = 0;
                        WholeNumber = 0.0;
                        CalTotal = 0.0;
                        symbol = '/';
                        place = 'c';
                        updateTotal();

                    }
                }
        );
        panel.add(Divide);

        Multiple = new JButton("*");
        Multiple.setBounds(195, 193, 100, 43);
        Multiple.setFont(new Font("", Font.ITALIC, 20));
        Multiple.setBackground(Color.ORANGE);
        Multiple.setBorderPainted(false);
        Multiple.setOpaque(true);
        Multiple.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ButtonPresses > 0 || EqualVar == 1) {
                            NumberStorage = CalTotal;
                        }
                        ButtonPresses = 0;
                        EqualVar = 0;
                        WholeNumber = 0.0;
                        CalTotal = 0.0;
                        symbol = '*';
                        place = 'c';
                        updateTotal();

                    }
                }
        );
        panel.add(Multiple);

        Clear = new JButton("C");
        Clear.setBounds(195, 238, 100, 43);
        Clear.setFont(new Font("", Font.ITALIC, 20));
        Clear.setBackground(Color.ORANGE);
        Clear.setBorderPainted(false);
        Clear.setOpaque(true);
        Clear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ButtonPresses = 0;
                        EqualVar = 0;
                        CalTotal = 0.0;
                        WholeNumber = 0.0;
                        NumberStorage = 0.0;
                        DecimalNumber = 0.0;
                        place = 'c';
                        updateTotal();
                    }
                }
        );
        panel.add(Clear);


    }

    private void updateTotal() {

        Total.setText(String.valueOf(df.format(CalTotal)));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new Calculator4().setVisible(true); }
        });
    }


    public int getButtonPresses() {
        return ButtonPresses;
    }

    public void setButtonPresses(int buttonPresses) {
        ButtonPresses = buttonPresses;
    }
}
