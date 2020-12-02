package calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorJFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 250);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(59,59,59));

        JLabel labelnumber = new JLabel("1. Zahl der Berechnung");
        labelnumber.setForeground(Color.WHITE);
        panel.add(labelnumber);

        JTextField number = new JTextField("", 30);
        panel.add(number);

        frame.add(panel);
        frame.setVisible(true);

    }
}
