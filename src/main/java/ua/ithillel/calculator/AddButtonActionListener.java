package ua.ithillel.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ua.ithillel.calculator.CalculatorConstants.ERROR_MESSAGE;

public class AddButtonActionListener implements ActionListener {

    private final JTextField input;

    public AddButtonActionListener(JTextField input) {
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var btn = (JButton) e.getSource();
        if (input.getText().contains(ERROR_MESSAGE)) input.setText("");
        input.setText(input.getText() + btn.getText());
    }
}
