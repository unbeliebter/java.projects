//Kapitel 5, Ag.1
package uni;

import java.util.Scanner;

public class Rekursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine natürliche Zahl an!");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Gebe eine natürliche Zahl im Bereich 0-Unendlich an");
            System.exit(-1);
        }

        int result = fMod3(number);
        System.out.println("Das Ergebnis der Modulo-Methode ohne modulo ist " + result);
    }

    public static int fMod3(int number) {
        return number - (3 * ( number / 3));
    }
}
