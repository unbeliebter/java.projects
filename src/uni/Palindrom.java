//Kapitel 5, Ag.8
package uni;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ein Wort ein!");

        String word = scanner.next();
        boolean palindromBoolean = palindrom(word);

        if (palindromBoolean) {
            System.out.println("Das Wort " + word + " ist ein Palindrom.");
        } else {
            System.out.println("Das Wort " + word + " ist kein Palindrom.");
        }
    }

    public static boolean palindrom(String text) {
        StringBuilder builder = new StringBuilder();
        char[] charTex = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            builder.append(charTex[text.length() - (i+1)]);
        }

        return text.equalsIgnoreCase(builder.toString());
    }
}
