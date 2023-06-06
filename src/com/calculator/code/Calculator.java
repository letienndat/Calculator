package com.calculator.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Calculator extends JFrame {
    private static final int sizeFontResult = 25;
    private static final int sizeFontInput = 14;
    private static final int sizeFontNumber = 14;
    private static final int sizeFontTextInformationApplication = 10;
    private static final String sourceImage = "/com/calculator/image/";
    private final JLabel jLabelTitle1;
    private final JLabel jLabelTitle2;
    private final JTextField jTextFieldResult;
    private final JTextField jTextFieldInputFirst;
    private final JTextField jTextFieldInputSecond;
    private final JTextField jTextFieldOperator;
    private final JButton jButtonNumber1;
    private final JButton jButtonNumber2;
    private final JButton jButtonNumber3;
    private final JButton jButtonNumber4;
    private final JButton jButtonNumber5;
    private final JButton jButtonNumber6;
    private final JButton jButtonNumber7;
    private final JButton jButtonNumber8;
    private final JButton jButtonNumber9;
    private final JButton jButtonNumber0;
    private final JButton jButtonOperatorCong;
    private final JButton jButtonOperatorTru;
    private final JButton jButtonOperatorNhan;
    private final JButton jButtonOperatorChia;
    private final JButton jButtonOperatorChiaDu;
    private final JButton jButtonOperatorBang;
    private final JButton jButtonOperatorAm;
    private final JButton jButtonDEL;
    private final JButton jButtonAC;
    private final JButton jButtonANS;
    private final JLabel jLabelInformationApplicationFirst;
    private final JLabel jLabelInformationApplicationSecond;
    private final JLabel jLabelANS;
    private String inputFirst = "0";
    private String inputSecond = "0";
    private String res = "0";
    private int check = 0;

    Calculator() {
        super("Calculator [letienndat]");
        setSize(455, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(250, 230, 230));
        setIconImage(new ImageIcon(Calculator.class.getResource(sourceImage + "Icon Calculator.png")).getImage());
        setFocusable(true);
        requestFocusInWindow();

        jLabelTitle1 = new JLabel("MÁY TÍNH TAY");
        jLabelTitle1.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
        jLabelTitle1.setBounds(30, 12, 100, 20);
        jLabelTitle1.setHorizontalAlignment(JLabel.LEFT);
        add(jLabelTitle1);

        jLabelTitle2 = new JLabel("CALCULATOR");
        jLabelTitle2.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
        jLabelTitle2.setBounds(250, 12, 410 - 250, 20);
        jLabelTitle2.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabelTitle2);

        jTextFieldResult = new JTextField(100);
        jTextFieldResult.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontResult));
        jTextFieldResult.setBounds(30, 50, 380, 50);
        jTextFieldResult.setHorizontalAlignment(JTextField.RIGHT);
        jTextFieldResult.setText("0");
        add(jTextFieldResult);

        jTextFieldInputFirst = new JTextField(30);
        jTextFieldInputFirst.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontInput));
        jTextFieldInputFirst.setBounds(30, 130, 150, 40);
        jTextFieldInputFirst.setHorizontalAlignment(JTextField.RIGHT);
        add(jTextFieldInputFirst);

        jTextFieldOperator = new JTextField(5);
        jTextFieldOperator.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontInput));
        jTextFieldOperator.setBounds(200, 130, 40, 40);
        jTextFieldOperator.setHorizontalAlignment(JTextField.CENTER);
        add(jTextFieldOperator);

        jTextFieldInputSecond = new JTextField(30);
        jTextFieldInputSecond.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontInput));
        jTextFieldInputSecond.setBounds(260, 130, 150, 40);
        jTextFieldInputSecond.setHorizontalAlignment(JTextField.RIGHT);
        add(jTextFieldInputSecond);

        jButtonNumber1 = new JButton("1");
        jButtonNumber1.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber1.setBounds(30, 200, 60, 35);
        jButtonNumber1.setBackground(Color.WHITE);
        jButtonNumber1.setOpaque(true);
        jButtonNumber1.setFocusPainted(false);
        jButtonNumber1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (check == 2) {
                    jTextFieldInputFirst.setText("");
                    jTextFieldInputSecond.setText("");
                    jTextFieldOperator.setText("");
                    inputFirst = "0";
                    inputSecond = "0";
                    check = 0;
                }
                if (check == 0) {
                    inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                    jTextFieldInputFirst.setText(inputFirst);
                    jLabelANS.setVisible(false);
                }
                if (check == 1) {
                    inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                    jTextFieldInputSecond.setText(inputSecond);
                }
            }
        });
        add(jButtonNumber1);

        jButtonNumber2 = new JButton("2");
        jButtonNumber2.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber2.setBounds(110, 200, 60, 35);
        jButtonNumber2.setBackground(Color.WHITE);
        jButtonNumber2.setOpaque(true);
        jButtonNumber2.setFocusPainted(false);
        jButtonNumber2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("2")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber2);

        jButtonNumber3 = new JButton("3");
        jButtonNumber3.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber3.setBounds(190, 200, 60, 35);
        jButtonNumber3.setBackground(Color.WHITE);
        jButtonNumber3.setOpaque(true);
        jButtonNumber3.setFocusPainted(false);
        jButtonNumber3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("3")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber3);

        jButtonNumber4 = new JButton("4");
        jButtonNumber4.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber4.setBounds(30, 260, 60, 35);
        jButtonNumber4.setBackground(Color.WHITE);
        jButtonNumber4.setOpaque(true);
        jButtonNumber4.setFocusPainted(false);
        jButtonNumber4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("4")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber4);

        jButtonNumber5 = new JButton("5");
        jButtonNumber5.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber5.setBounds(110, 260, 60, 35);
        jButtonNumber5.setBackground(Color.WHITE);
        jButtonNumber5.setOpaque(true);
        jButtonNumber5.setFocusPainted(false);
        jButtonNumber5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("5")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber5);

        jButtonNumber6 = new JButton("6");
        jButtonNumber6.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber6.setBounds(190, 260, 60, 35);
        jButtonNumber6.setBackground(Color.WHITE);
        jButtonNumber6.setOpaque(true);
        jButtonNumber6.setFocusPainted(false);
        jButtonNumber6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("6")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber6);

        jButtonNumber7 = new JButton("7");
        jButtonNumber7.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber7.setBounds(30, 320, 60, 35);
        jButtonNumber7.setBackground(Color.WHITE);
        jButtonNumber7.setOpaque(true);
        jButtonNumber7.setFocusPainted(false);
        jButtonNumber7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("7")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber7);

        jButtonNumber8 = new JButton("8");
        jButtonNumber8.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber8.setBounds(110, 320, 60, 35);
        jButtonNumber8.setBackground(Color.WHITE);
        jButtonNumber8.setOpaque(true);
        jButtonNumber8.setFocusPainted(false);
        jButtonNumber8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("8")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber8);

        jButtonNumber9 = new JButton("9");
        jButtonNumber9.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber9.setBounds(190, 320, 60, 35);
        jButtonNumber9.setBackground(Color.WHITE);
        jButtonNumber9.setOpaque(true);
        jButtonNumber9.setFocusPainted(false);
        jButtonNumber9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("9")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber9);

        jButtonNumber0 = new JButton("0");
        jButtonNumber0.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonNumber0.setBounds(30, 380, 60, 35);
        jButtonNumber0.setBackground(Color.WHITE);
        jButtonNumber0.setOpaque(true);
        jButtonNumber0.setFocusPainted(false);
        jButtonNumber0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("0")) {
                    if (check == 2) {
                        jTextFieldInputFirst.setText("");
                        jTextFieldInputSecond.setText("");
                        jTextFieldOperator.setText("");
                        inputFirst = "0";
                        inputSecond = "0";
                        check = 0;
                    }
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputFirst.setText(inputFirst);
                        jLabelANS.setVisible(false);
                    }
                    if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) * 10 + Long.parseLong(e.getActionCommand()));
                        jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonNumber0);

        jButtonOperatorCong = new JButton("+");
        jButtonOperatorCong.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorCong.setBounds(270, 260, 60, 35);
        jButtonOperatorCong.setBackground(Color.WHITE);
        jButtonOperatorCong.setOpaque(true);
        jButtonOperatorCong.setFocusPainted(false);
        jButtonOperatorCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("+")) {
                    if (check == 0 || check == 1) {
                        check = 1;
                    } else {
                        jTextFieldInputFirst.setText(inputFirst);
                        jTextFieldInputSecond.setText("");
                        jTextFieldResult.setText("0");
                        check = 1;
                        jLabelANS.setVisible(true);
                    }
                    jTextFieldOperator.setText(e.getActionCommand());
                }
            }
        });
        add(jButtonOperatorCong);

        jButtonOperatorTru = new JButton("-");
        jButtonOperatorTru.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorTru.setBounds(350, 260, 60, 35);
        jButtonOperatorTru.setBackground(Color.WHITE);
        jButtonOperatorTru.setOpaque(true);
        jButtonOperatorTru.setFocusPainted(false);
        jButtonOperatorTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("-")) {
                    if (check == 0 || check == 1) {
                        check = 1;
                    } else {
                        jTextFieldInputFirst.setText(inputFirst);
                        jTextFieldInputSecond.setText("");
                        jTextFieldResult.setText("0");
                        check = 1;
                        jLabelANS.setVisible(true);
                    }
                    jTextFieldOperator.setText(e.getActionCommand());
                }
            }
        });
        add(jButtonOperatorTru);

        jButtonOperatorNhan = new JButton("x");
        jButtonOperatorNhan.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorNhan.setBounds(270, 320, 60, 35);
        jButtonOperatorNhan.setBackground(Color.WHITE);
        jButtonOperatorNhan.setOpaque(true);
        jButtonOperatorNhan.setFocusPainted(false);
        jButtonOperatorNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("x")) {
                    if (check == 0 || check == 1) {
                        check = 1;
                    } else {
                        jTextFieldInputFirst.setText(inputFirst);
                        jTextFieldInputSecond.setText("");
                        jTextFieldResult.setText("0");
                        check = 1;
                        jLabelANS.setVisible(true);
                    }
                    jTextFieldOperator.setText(e.getActionCommand());
                }
            }
        });
        add(jButtonOperatorNhan);

        jButtonOperatorChia = new JButton("/");
        jButtonOperatorChia.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorChia.setBounds(350, 320, 60, 35);
        jButtonOperatorChia.setBackground(Color.WHITE);
        jButtonOperatorChia.setOpaque(true);
        jButtonOperatorChia.setFocusPainted(false);
        jButtonOperatorChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("/")) {
                    if (check == 0 || check == 1) {
                        check = 1;
                    } else {
                        jTextFieldInputFirst.setText(inputFirst);
                        jTextFieldInputSecond.setText("");
                        jTextFieldResult.setText("0");
                        check = 1;
                        jLabelANS.setVisible(true);
                    }
                    jTextFieldOperator.setText(e.getActionCommand());
                }
            }
        });
        add(jButtonOperatorChia);

        jButtonOperatorAm = new JButton("(-)");
        jButtonOperatorAm.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorAm.setBounds(110, 380, 60, 35);
        jButtonOperatorAm.setBackground(Color.WHITE);
        jButtonOperatorAm.setOpaque(true);
        jButtonOperatorAm.setFocusPainted(false);
        jButtonOperatorAm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("(-)")) {
                    if (check == 0) {
                        if (!inputFirst.equals("0")) {
                            if (inputFirst.charAt(0) == '-') {
                                inputFirst = inputFirst.substring(1);
                                jTextFieldInputFirst.setText(inputFirst);
                            } else {
                                inputFirst = "-" + inputFirst;
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                        }
                    } else {
                        if (!inputSecond.equals("0")) {
                            if (inputSecond.charAt(0) == '-') {
                                inputSecond = inputSecond.substring(1);
                                jTextFieldInputSecond.setText(inputSecond);
                            } else {
                                inputSecond = "-" + inputSecond;
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                        }
                    }
                }
            }
        });
        add(jButtonOperatorAm);

        jButtonOperatorChiaDu = new JButton("%");
        jButtonOperatorChiaDu.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorChiaDu.setBounds(190, 380, 60, 35);
        jButtonOperatorChiaDu.setBackground(Color.WHITE);
        jButtonOperatorChiaDu.setOpaque(true);
        jButtonOperatorChiaDu.setFocusPainted(false);
        jButtonOperatorChiaDu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("%")) {
                    if (check == 0 || check == 1) {
                        check = 1;
                    } else {
                        jTextFieldInputFirst.setText(inputFirst);
                        jTextFieldInputSecond.setText("");
                        jTextFieldResult.setText("0");
                        check = 1;
                        jLabelANS.setVisible(true);
                    }
                    jTextFieldOperator.setText(e.getActionCommand());
                }
            }
        });
        add(jButtonOperatorChiaDu);

        jLabelANS = new JLabel("ANS");
        jLabelANS.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontTextInformationApplication));
        jLabelANS.setBounds(30, 112, 20, 20);
        jLabelANS.setVisible(false);
        add(jLabelANS);

        jButtonANS = new JButton("ANS");
        jButtonANS.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonANS.setBounds(270, 380, 60, 35);
        jButtonANS.setBackground(Color.WHITE);
        jButtonANS.setOpaque(true);
        jButtonANS.setFocusPainted(false);
        jButtonANS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputFirst = res;
                jTextFieldInputFirst.setText(inputFirst);
                inputSecond = "0";
                jTextFieldInputSecond.setText("");
                jTextFieldResult.setText("0");
                jTextFieldOperator.setText("");
                jLabelANS.setVisible(true);
            }
        });
        add(jButtonANS);

        jButtonOperatorBang = new JButton("=");
        jButtonOperatorBang.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonOperatorBang.setBounds(350, 380, 60, 35);
        jButtonOperatorBang.setBackground(Color.WHITE);
        jButtonOperatorBang.setOpaque(true);
        jButtonOperatorBang.setFocusPainted(false);
        jButtonOperatorBang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check = 2;
                switch (jTextFieldOperator.getText()) {
                    case "+":
                        try {
                            res = String.valueOf(new BigInteger(inputFirst).add(new BigInteger(inputSecond)));
                            if (jTextFieldInputFirst.getText().equals("")) {
                                inputFirst = "0";
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                            if (jTextFieldInputSecond.getText().equals("")) {
                                inputSecond = "0";
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                        } finally {
                            break;
                        }
                    case "-":
                        try {
                            res = String.valueOf(new BigInteger(inputFirst).subtract(new BigInteger(inputSecond)));
                            if (jTextFieldInputFirst.getText().equals("")) {
                                inputFirst = "0";
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                            if (jTextFieldInputSecond.getText().equals("")) {
                                inputSecond = "0";
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                        } finally {
                            break;
                        }
                    case "x":
                        try {
                            res = String.valueOf(new BigInteger(inputFirst).multiply(new BigInteger(inputSecond)));
                            if (jTextFieldInputFirst.getText().equals("")) {
                                inputFirst = "0";
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                            if (jTextFieldInputSecond.getText().equals("")) {
                                inputSecond = "0";
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                        } finally {
                            break;
                        }
                    case "/":
                        try {
                            res = String.valueOf(new BigInteger(inputFirst).divide(new BigInteger(inputSecond)));
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                            if (jTextFieldInputFirst.getText().equals("")) {
                                inputFirst = "0";
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                            if (jTextFieldInputSecond.getText().equals("")) {
                                inputSecond = "0";
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                        } finally {
                            break;
                        }
                    case "%":
                        try {
                            res = String.valueOf(Long.parseLong(inputFirst) % Long.parseLong(inputSecond));
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                            if (jTextFieldInputFirst.getText().equals("")) {
                                inputFirst = "0";
                                jTextFieldInputFirst.setText(inputFirst);
                            }
                            if (jTextFieldInputSecond.getText().equals("")) {
                                inputSecond = "0";
                                jTextFieldInputSecond.setText(inputSecond);
                            }
                        } finally {
                            break;
                        }
                    default:
                        try {
                            res = String.valueOf(new BigInteger(inputFirst));
                            jTextFieldResult.setText(res);
                        } catch (Exception ex) {
                            jTextFieldResult.setText("Error");
                        } finally {
                            break;
                        }
                }
                inputSecond = "0";
                inputFirst = res;
            }
        });
        add(jButtonOperatorBang);

        jButtonDEL = new JButton("DEL");
        jButtonDEL.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonDEL.setBounds(270, 200, 60, 35);
        jButtonDEL.setBackground(Color.WHITE);
        jButtonDEL.setOpaque(true);
        jButtonDEL.setFocusPainted(false);
        jButtonDEL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("DEL")) {
                    if (check == 0) {
                        inputFirst = String.valueOf(Long.parseLong(inputFirst) / 10);
                        if (inputFirst.equals("0")) {
                            jTextFieldInputFirst.setText("");
                        } else jTextFieldInputFirst.setText(inputFirst);
                    } else if (check == 1) {
                        inputSecond = String.valueOf(Long.parseLong(inputSecond) / 10);
                        if (inputSecond.equals("0")) {
                            jTextFieldInputSecond.setText("");
                        } else jTextFieldInputSecond.setText(inputSecond);
                    }
                }
            }
        });
        add(jButtonDEL);

        jButtonAC = new JButton("AC");
        jButtonAC.setFont(new Font("JetBrains Mono", Font.BOLD, sizeFontNumber));
        jButtonAC.setBounds(350, 200, 60, 35);
        jButtonAC.setBackground(Color.WHITE);
        jButtonAC.setOpaque(true);
        jButtonAC.setFocusPainted(false);
        jButtonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("AC")) {
                    jTextFieldInputFirst.setText("");
                    jTextFieldInputSecond.setText("");
                    jTextFieldResult.setText("0");
                    jTextFieldOperator.setText("");
                    check = 0;
                    inputSecond = "0";
                    inputFirst = "0";
                    jLabelANS.setVisible(false);
                }
            }
        });
        add(jButtonAC);

        jLabelInformationApplicationFirst = new JLabel("@letienndat");
        jLabelInformationApplicationFirst.setFont(new Font("Inter", Font.PLAIN, sizeFontTextInformationApplication));
        jLabelInformationApplicationFirst.setBounds(455 / 2 - 100 / 2, 450, 100, 20);
        jLabelInformationApplicationFirst.setHorizontalAlignment(JLabel.CENTER);
        add(jLabelInformationApplicationFirst);

        jLabelInformationApplicationSecond = new JLabel("Copyright of letienndat");
        jLabelInformationApplicationSecond.setFont(new Font("Inter", Font.PLAIN, sizeFontTextInformationApplication));
        jLabelInformationApplicationSecond.setBounds(455 / 2 - 150 / 2, 463, 150, 20);
        jLabelInformationApplicationSecond.setHorizontalAlignment(JLabel.CENTER);
        add(jLabelInformationApplicationSecond);

        setLayout(null);
    }
}

// END