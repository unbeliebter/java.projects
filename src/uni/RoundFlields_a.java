package uni;

public class RoundFlields_a {
    public static void main(String[] args) {

        double q1 = 0.1;
        double number = 1;
        for (int i = 0; i < 16; i++) {

            for (int j = 0; j < i; j++) {
                number = number + (q1 * q1);
            }
            System.out.println("Zwischenergebnis von Durchlauf " + i + ": " + number);
        }
        System.out.println("Die Summe von q beträgt nach dem Durchlauf " + number);
    }
}

