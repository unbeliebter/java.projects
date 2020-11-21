package bwinf.passwords;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe für die erste Methode deines Passwortes Wörter an");
        String words = scanner.nextLine();

        String output = passwordGenFirst(words);
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
}
