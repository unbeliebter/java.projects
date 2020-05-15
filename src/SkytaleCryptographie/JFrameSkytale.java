import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameSkytale {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Skytale");
        frame.setSize(400, 250);
        frame.setTitle("Skytale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(59,59,59));

        JLabel labelword = new JLabel("» Wort zur Verschlüsselung «");
        labelword.setForeground(Color.WHITE);
        panel.add(labelword);

        JTextField word = new JTextField("", 30);
        panel.add(word);

        JLabel labelnumber = new JLabel("» Breite des Stabes «");
        labelnumber.setForeground(Color.WHITE);
        panel.add(labelnumber);

        JTextField number = new JTextField("", 30);
        panel.add(number);

        JButton buttonCrypt = new JButton("Klicke hier, um zu Verschlüsseln");
        buttonCrypt.setForeground(Color.WHITE);
        buttonCrypt.setBackground(new Color(127, 127, 127));
        panel.add(buttonCrypt);

        JLabel labelline = new JLabel("______________________________________________________");
        labelline.setForeground(Color.WHITE);
        panel.add(labelline);

        JLabel labeloutput = new JLabel("» Verschlüsseltes Wort «");
        labeloutput.setForeground(Color.WHITE);
        panel.add(labeloutput);

        JTextField outputField = new JTextField("", 30);
        panel.add(outputField);


        buttonCrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputWord = word.getText();
                String inputNumber = number.getText();

                JFrame frameError = new JFrame("Fehler!");
                frameError.setSize(400, 150);
                frameError.setTitle("Fehler");
                frameError.setResizable(false);

                JPanel panelError = new JPanel();
                panelError.setBackground(new Color(59,59,59));

                if (inputWord.length() == 0 || inputNumber.length() == 0 ) {
                    JLabel error = new JLabel("Es ist ein Fehler aufgetreten!");
                    error.setForeground(Color.WHITE);
                    panelError.add(error);

                    if (inputWord.length() == 0) {
                        JLabel error2 = new JLabel("Bitte gebe ein zu verschlüsselndes Wort ein!");
                        error2.setForeground(Color.WHITE);
                        panelError.add(error2);
                    } else if (inputNumber.length() == 0) {
                        JLabel error2 = new JLabel("Gebe die Länge des Stabes ein!");
                        error2.setForeground(Color.WHITE);
                        panelError.add(error2);
                    }

                    JLabel labelline = new JLabel("______________________________________________________");
                    labelline.setForeground(Color.WHITE);
                    panelError.add(labelline);

                    frameError.setVisible(true);
                    frameError.add(panelError);

                } else {
                    int intInputNumber = Integer.parseInt(inputNumber);
                    String output = crypting(inputWord, intInputNumber);

                    outputField.setText(output);
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

        outputField.setEditable(false);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static String crypting (String input, int length) {
        String result = "";
        String finalResult = "";
        int check = 0;

        for (int i = 0; input.length() != finalResult.length() ; i++) {
            result = input.substring(i, i + 1);
            finalResult = finalResult + result;

            i = i + length - 1;

            if (i + 2 > input.length()) {
                i = check;
                check++;
            }
        }

        return finalResult;
    }
}
