package ua.ithillel.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;

import static ua.ithillel.calculator.CalculatorConstants.ERROR_MESSAGE;

public class BasicApplicationFrame {

    private final JFrame mainFrame = new JFrame();

    public BasicApplicationFrame() {
        mainFrame.setTitle("Basic Application v1.0.0");
        mainFrame.setBounds(100, 70, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());

        // top
        var top = new JPanel();
        top.setLayout(new BorderLayout());

        var inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField, BorderLayout.CENTER);

        mainFrame.add(top, BorderLayout.NORTH);

        // bottom
        var bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 4));

        var btnAddActionListener = new AddButtonActionListener(inputField);

        var acBtn = new JButton("AC");
        acBtn.addActionListener(event -> inputField.setText(""));
        bottom.add(acBtn);

        var plusBtn = new JButton("+");
        plusBtn.addActionListener(btnAddActionListener);
        bottom.add(plusBtn);

        var minusBtn = new JButton("-");
        minusBtn.addActionListener(btnAddActionListener);
        bottom.add(minusBtn);

        var calcBtn = new JButton("=");
        calcBtn.addActionListener(event -> {
            double answer = 0;

            if (inputField.getText().contains("+")) {
                answer = getSumWithPlus(inputField);
            } else if (inputField.getText().contains("-")) {
                answer = getSumWithMinus(inputField);
            } else if (inputField.getText().contains("*")) {
                answer = getMultiply(inputField);
            } else if (inputField.getText().contains("/")) {
                answer = getDivide(inputField);
            } else if (inputField.getText().contains("√")) {
                answer = getRoot(inputField);
            }


            inputField.setText(String.valueOf(answer));
        });
        bottom.add(calcBtn);

        for (int i = 0; i <= 9; i++) {
            var btn = new JButton(String.valueOf(i));
            btn.addActionListener(btnAddActionListener);
            bottom.add(btn);
        }

        var multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(btnAddActionListener);
        bottom.add(multiplyBtn);

        var divideBtn = new JButton("/");
        divideBtn.addActionListener(btnAddActionListener);
        bottom.add(divideBtn);

        var rootBtn = new JButton("√");
        rootBtn.addActionListener(btnAddActionListener);
        bottom.add(rootBtn);

        mainFrame.add(bottom, BorderLayout.CENTER);


        mainFrame.setVisible(true);
    }

    private int getSumWithPlus(JTextField inputField) {
        int sum = 0;
        for (String operand : inputField.getText().split("\\+")) {
            try {
                sum += Integer.parseInt(operand);
            } catch (NumberFormatException e) {
                inputField.setText(ERROR_MESSAGE);
                break;
            }
        }
        return sum;
    }

    private int getSumWithMinus(JTextField inputField) {
        String[] operand = inputField.getText().split("-");
        int sum = Integer.parseInt(operand[0]);
        for (int i = 1; i < operand.length; i++) {
            try {
                sum -= Integer.parseInt(operand[i]);
            } catch (NumberFormatException e) {
                inputField.setText(ERROR_MESSAGE);
                break;
            }
        }
        return sum;
    }

    private int getMultiply(JTextField inputField) {
        String[] operand = inputField.getText().split("\\*");
        int sum = Integer.parseInt(operand[0]);
        for (int i = 1; i < operand.length; i++) {
            try {
                if (operand[i].equals("0")) {
                    sum = 0;
                    break;
                }
                sum *= Integer.parseInt(operand[i]);
            } catch (NumberFormatException e) {
                inputField.setText(ERROR_MESSAGE);
                break;
            }
        }
        return sum;
    }

    private double getDivide(JTextField inputField) {
        String[] operand = inputField.getText().split("/");
        double sum = Double.parseDouble(operand[0]);
        for (int i = 1; i < operand.length; i++) {
            try {
                if (operand[i].equals("0")) {
                    sum = 0;
                    break;
                }
                sum /= Integer.parseInt(operand[1]);
            } catch (NumberFormatException e) {
                inputField.setText(ERROR_MESSAGE);
                break;
            }
        }
        return sum;
    }

    private double getRoot(JTextField inputField) {
        String[] operand = inputField.getText().split("√");
        double sum = 0;
        for (int i = 1; i < operand.length; i++) {
            try {
                if (operand[i].equals("0")) {
                    sum = 0;
                    break;
                } else {
                    sum = Math.sqrt(Double.parseDouble(operand[0]));
                }
            } catch (NumberFormatException e) {
                inputField.setText(ERROR_MESSAGE);
                break;
            }
        }
        return sum;
    }
    ScriptEngine engine = (ScriptEngine) new ScriptEngineManager();
}
