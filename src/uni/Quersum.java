//Kapitel 4, Ag. 15
package uni;

import java.util.Scanner;

public class Quersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie eine natürliche Zahl an!");
        String numberString = scanner.nextLine();

        if (numberString.contains("-")) {
            System.out.println("Die Zahl ist zu klein! Gebe eine Zahl zwischen 0 und unendlich an.");
            System.exit(1);
        }

        int number;
        int result = 0;

        String[] numberStringArray = numberString.split("");

        for (int i = 0; i < numberString.length(); i++) {
            number = Integer.parseInt(numberStringArray[i]);
            result = result + number;
        }

        System.out.println("Die Quersumme der Zahl " + numberString + " ist: " + result);

    }
}
