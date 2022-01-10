package uni;

import java.util.Scanner;

public class Crypting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Satz/ein Wort zum Verschlüsseln an! (nur Kleinschreibung)");

        String input = scanner.nextLine();
        scanner.close();
        String[] splitString;
        splitString = input.split(" ");

        char[] charString;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int cryptingNumber = 0;

        for (String charHelper : splitString) {
            charString = charHelper.toCharArray();

            for (int j = 0; j < charHelper.length(); ) {
                for (int k = 0; k < 26; k++) {
                    if (charString[j] == alphabet[k]) {
                        cryptingNumber = k + 13;
                        if (cryptingNumber > 25) {
                            cryptingNumber = cryptingNumber % 26;
                        }
                        stringBuilder.append(alphabet[cryptingNumber]);
                        break;
                    }
                }
                j++;
            }
            stringBuilder.append(" ");
        }
        System.out.println("Verschlüsselte Nachricht: " + stringBuilder + "\n" + "Klartext: " + input);
    }
}
