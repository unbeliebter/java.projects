//Kapitel 4, Ag.10
package uni;

public class RoundFields_b {
    public static void main(String[] args) {

        double q1 = 0.1;
        double number = 0;
        double numberClone;

        for (int i = 15; i != -1; i--) {

            if (i == 0) {
                number = number + 1;
            }

            for (int j = 0; j < i; j++) {
                number = number + (q1 * q1);
            }
            System.out.println("Zwischenergebnis von Durchlauf " + i + ": " + number);
        }
        System.out.println("Die Summe von q beträgt nach dem Durchlauf " + number);
    }
}
