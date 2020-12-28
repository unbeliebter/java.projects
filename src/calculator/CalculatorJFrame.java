package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorJFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 275);
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

        JLabel labelline = new JLabel("______________________________________________________");
        labelline.setForeground(Color.WHITE);
        panel.add(labelline);

        JLabel outputLabel = new JLabel("");
        outputLabel.setForeground(Color.WHITE);
        panel.add(outputLabel);

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNumberOne = numberOne.getText();
                String inputNumberTwo = numberTwo.getText();

                JFrame frameError = new JFrame("Fehler aufgetreten");
                frameError.setSize(400, 150);
                frameError.setTitle("Fehler aufgetreten");
                frameError.setResizable(false);

                JPanel panelError = new JPanel();
                panelError.setBackground(new Color(59,59,59));

                if (inputNumberOne.length() == 0 || inputNumberTwo.length() == 0) {
                    JLabel error = new JLabel("Es ist ein Fehler aufgetreten!");
                    error.setForeground(Color.WHITE);
                    panelError.add(error);

                    if (inputNumberOne.length() == 0) {
                        JLabel error2 = new JLabel("Bitte gebe die erste Zahl an!");
                        error2.setForeground(Color.WHITE);
                        panelError.add(error2);
                    } else if (inputNumberTwo.length() == 0) {
                        JLabel error2 = new JLabel("Bitte gebe die zweite Zahl an!");
                        error2.setForeground(Color.WHITE);
                        panelError.add(error2);
                    }

                    JLabel labelline = new JLabel("______________________________________________________");
                    labelline.setForeground(Color.WHITE);
                    panelError.add(labelline);

                    frameError.setVisible(true);
                    frameError.add(panelError);

                } else {

                    double inputNumberOneDouble = Double.parseDouble(inputNumberOne);
                    double inputNumberTwoDouble = Double.parseDouble(inputNumberTwo);

                    String output = "<html>Addition: " + addition(inputNumberOneDouble, inputNumberTwoDouble) + "<br>" +
                            "Subtraktion: " + subtraction(inputNumberOneDouble, inputNumberTwoDouble) + "<br>" +
                            "Multiplikation: " + multiplication(inputNumberOneDouble, inputNumberTwoDouble) + "<br>" +
                            "Division: " + divison(inputNumberOneDouble, inputNumberTwoDouble) + "</html>";
                    outputLabel.setText(output);
                }

                JButton buttonClose = new JButton("Okay");
                buttonClose.setForeground(Color.WHITE);
                buttonClose.setBackground(new Color(127, 127, 127));
                panelError.add(buttonClose);

                buttonClose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frameError.dispose();
                    }
                });
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
