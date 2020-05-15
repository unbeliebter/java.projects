import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomaticAnswers {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Skytale");
        frame.setSize(400, 450);
        frame.setTitle("Skytale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(59,59,59));

        frame.add(panel);
        frame.setVisible(true);
    }
}
