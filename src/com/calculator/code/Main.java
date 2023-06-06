package com.calculator.code;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}