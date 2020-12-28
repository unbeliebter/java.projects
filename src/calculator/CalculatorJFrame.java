package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorJFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 250);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(59,59,59));

        JLabel labelNumberOne = new JLabel("1. Zahl der Berechnung");
        labelNumberOne.setForeground(Color.WHITE);
        panel.add(labelNumberOne);

        JTextField numberOne = new JTextField("", 30);
        panel.add(numberOne);

        JLabel labelNumberTwo = new JLabel("2. Zahl der Berechnung");
        labelNumberTwo.setForeground(Color.WHITE);
        panel.add(labelNumberTwo);

        JTextField numberTwo = new JTextField("", 30);
        panel.add(numberTwo);

        JButton buttonCalculate = new JButton("Berechnen");
        buttonCalculate.setForeground(Color.WHITE);
        buttonCalculate.setBackground(new Color(127, 127, 127));
        panel.add(buttonCalculate);

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNumberOne = numberOne.getText();
                String inputNumberTwo = numberTwo.getText();
            }
        });

        frame.add(panel);
        frame.setVisible(true);

    }

    public static double addition(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public static double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public static double divison(double numberOne, double numberTwo) {
        return  numberOne / numberTwo;
    }
}
