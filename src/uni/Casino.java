//Kapitel 5, Aufgabe 4
package uni;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe deinen Einsatz ein! (Summe bis zu 10.000 Punkte)");
        int points = scanner.nextInt();

        if (points > 10000 || points < 0) {
            System.out.println("Bitte gebe die Punkte im Bereich von 1 bis 10000 an!");
            System.exit(-1);
        }

        System.out.println("Gebe nun deine Glückszahl ein (0-9)");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Gebe eine Glückszahl im Zahlenbereich von 0-9 an!");
            System.exit(-2);
        }

        double luckynumber = Math.round(Math.random() * 9);
        int luckyNumberInt = (int) luckynumber;
        System.out.println("Die Glückszahl lautet " + luckyNumberInt);

        if(luckyNumberInt == number) {
            points = points * 9;
            System.out.println("Du hast richtig gelegen. Die Glückszahl ist " + luckyNumberInt + ". Somit hast du " + points + " Punkte gewonnen.");
        } else {
            System.out.println("Leider hast du nicht gewonnen!");
        }
    }
}
