import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomaticAnswers {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Standartantworten | Contents");
        frame.setSize(300, 450);
        frame.setTitle("Standartantworten | Contents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon icon = new ImageIcon("H:\\java.projects\\src\\automaticAnswers\\Screenshot_435.png");
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(59,59,59));

        JLabel wirdWeitergegeben = new JLabel("» Wird weitergegeben «");
        wirdWeitergegeben.setForeground(Color.WHITE);
        panel.add(wirdWeitergegeben);

        JButton wirdWeitergegebenButton = new JButton("*Klicke hier*");
        wirdWeitergegebenButton.setForeground(Color.WHITE);
        wirdWeitergegebenButton.setBackground(new Color(127, 127, 127));
        panel.add(wirdWeitergegebenButton);

        wirdWeitergegebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame wirdWeitergegebenFrame = new JFrame("Standardantwort | Wird weitergegeben");
                wirdWeitergegebenFrame.setSize(800, 350);
                wirdWeitergegebenFrame.setTitle("Standardantwort | Wird weitergegeben");
                wirdWeitergegebenFrame.setResizable(false);

                JPanel wirdWeitergegebenPanel = new JPanel();
                wirdWeitergegebenPanel.setBackground(new Color(59,59,59));

                JTextArea wirdWeitergegebenArea = new JTextArea();
                wirdWeitergegebenArea.setText("Hallo,\n" +
                        "\n" +
                        "vielen Dank für Deine Unterstützung und Dein damit verbundenes Interesse an unserem Netzwerk.\n" +
                        "\n" +
                        "Wir konnten deinen Bug erfolgreich reproduzieren und werden nun diesen an unser Entwicklerteam weiterleiten.\n" +
                        "Bitte beachte, dass es einige Zeit beanspruchen kann, bis wir den Fehler endgültig beheben.\n" +
                        "\n" +
                        "Ich wünsche Dir noch einen angenehmen Tag.\n" +
                        "\n" +
                        "Mit freundlichen Grüßen\n" +
                        "unbeliebter | Sven");
                wirdWeitergegebenArea.setBounds(25, 25, 750, 100);
                wirdWeitergegebenArea.setLineWrap(true);
                wirdWeitergegebenArea.setEditable(false);
                wirdWeitergegebenPanel.add(wirdWeitergegebenArea);

                String wirdWeitergegebenString = wirdWeitergegebenArea.getText();

                JButton wirdWeitergegebenButtonSecond = new JButton("*Copy*");
                wirdWeitergegebenButtonSecond.setForeground(Color.WHITE);
                wirdWeitergegebenButtonSecond.setBackground(new Color(127, 127, 127));
                wirdWeitergegebenPanel.add(wirdWeitergegebenButtonSecond);

                wirdWeitergegebenButtonSecond.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        StringSelection stringSelection = new StringSelection(wirdWeitergegebenString);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                    }
                });

                wirdWeitergegebenFrame.setVisible(true);
                wirdWeitergegebenFrame.add(wirdWeitergegebenPanel);

            }
        });

        JLabel bugBehobenLabel = new JLabel("» Bug behoben «");
        bugBehobenLabel.setForeground(Color.WHITE);
        panel.add(bugBehobenLabel);

        JButton bugBehobenButton = new JButton("*Klicke hier*");
        bugBehobenButton.setForeground(Color.WHITE);
        bugBehobenButton.setBackground(new Color(127, 127, 127));
        panel.add(bugBehobenButton);

        bugBehobenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame bugBehobenFrame = new JFrame("Standardantwort | Bug behoben");
                bugBehobenFrame.setSize(800, 350);
                bugBehobenFrame.setTitle("Standardantwort | Bug behoben");
                bugBehobenFrame.setResizable(false);

                JPanel bugBehobenPanel = new JPanel();
                bugBehobenPanel.setBackground(new Color(59,59,59));

                JTextArea bugBehobenArea = new JTextArea();
                bugBehobenArea.setText("Hallo,\n" +
                        "\n" +
                        "Wir freuen uns dir mitteilen zu können, dass dein gemeldeter Bug nun behoben ist.\n" +
                        "Sollte der Fehler bei dir in naher Zukunft erneut auftreten, bitte ich dich einen neuen Beitrag zu verfassen.\n" +
                        "\n" +
                        "Ich wünsche Dir noch einen angenehmen Tag.\n" +
                        "\n" +
                        "Mit freundlichen Grüßen\n" +
                        "unbeliebter | Sven");
                bugBehobenArea.setBounds(25, 25, 750, 100);
                bugBehobenArea.setLineWrap(true);
                bugBehobenArea.setEditable(false);
                bugBehobenPanel.add(bugBehobenArea);

                String bugBehobenString = bugBehobenArea.getText();

                JButton BugbehobenButtonSecond = new JButton("*Copy*");
                BugbehobenButtonSecond.setForeground(Color.WHITE);
                BugbehobenButtonSecond.setBackground(new Color(127, 127, 127));
                bugBehobenPanel.add(BugbehobenButtonSecond);

                BugbehobenButtonSecond.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        StringSelection stringSelection = new StringSelection(bugBehobenString);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                    }
                });

                bugBehobenFrame.setVisible(true);
                bugBehobenFrame.add(bugBehobenPanel);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
