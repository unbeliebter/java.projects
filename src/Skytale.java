import java.util.Scanner;

public class Skytale {
    public static void main(String[] args) {

        System.out.println("» Gebe ein Wort an, welches verschlüsselt werden soll:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("» Gebe eine Breite des Stabes ein:");
        int length = scanner.nextInt();

        String result = crypting(input, length);
        System.out.println("» Die Verschlüsselte Nachricht ist:");
        System.out.println("» " + result);
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

