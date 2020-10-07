package DanielHopsNehmen;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {

        double aktien, rate;
        String capital = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Limited capital?");
        capital = scanner.nextLine();

        System.out.println("Aktien besparen?");
        aktien = scanner.nextDouble();

        System.out.println("Sparrate?");
        rate = scanner.nextDouble();

        if (!capital.contains("Ja") || capital.contains("Nein")) {
            while (!capital.contains("Ja") || capital.contains("Nein")) {
                System.out.println("Die Eingabe bei Limited captial kann nur Ja oder Nein sein!");
                capital = scanner.nextLine();

                if (capital.contains("Ja") || capital.contains("Nein")) {
                    break;
                }
            }
        }
    }
}
