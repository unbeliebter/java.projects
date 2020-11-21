package bwinf.passwords;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe für die erste Methode und zweite Methode deines Passwortes Wörter an");
        String words = scanner.nextLine();

        System.out.println("Geben sie die Länge des Passworts an für die dritte Methode");
        int length = scanner.nextInt();

        String output = "____________________________________________________________" + "\n" +
                "Erstes Passwort: " + passwordGenFirst(words)  + "\n" +
                "Zweites Passwort: " +  passwordGenSecond(words)  + "\n" +
                "Drittes Passwort: " + passwordGenThird(length)  + "\n" +
                "____________________________________________________________";

        System.out.println(output);
    }

    public static String passwordGenFirst(String words) {
        words = words.replace("e", "3");
        words = words.replace("a", "@");
        words = words.replace("o", "0");
        words = words.replace("l", "1");
        words = words.replace(" ", "#");
        words = words.replace("i", "!");

        return words;
    }

    public static String passwordGenSecond(String words) {
        words = words.replace("e", "#");
        words = words.replace("a", "#");
        words = words.replace("o", "#");
        words = words.replace(" ", "_");
        words = words.replace("i", "#");

        return words;
    }

    public static String passwordGenThird(int length) {
        String[] konsonanten = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        String[] vokale = {"a", "e", "i", "o", "u"};
        String password;
        String passwordFinal = "";
        int number;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                number =  (int) Math.round(Math.random()*20);
                password = konsonanten[number];
            } else {
                number =  (int) Math.round(Math.random()*4);
                password = vokale[number];
            }
            passwordFinal = passwordFinal + "" + password;
        }
        return passwordFinal;
    }
}
