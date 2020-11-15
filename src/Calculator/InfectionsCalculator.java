package Calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class InfectionsCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe das Zeitintervall an: (>0)");
        int time = scanner.nextInt();

        if (time < 0) {
            System.out.println("Die Zahl ist leider zu klein und muss über 0 liegen!");
            time = scanner.nextInt();
        }

        System.out.println("Gebe die Reproduktionszahl an");
        BigDecimal reproductionNumber = scanner.nextBigDecimal();

        System.out.println("Gebe die aktiven Infektionen an (>0)");
        BigDecimal infectionNumber = scanner.nextBigDecimal();

        BigDecimal zero = new BigDecimal(0);

        if (infectionNumber.compareTo(zero) < 0) {
            System.out.println("Die Zahl ist leider zu klein und muss über 0 liegen!");
            infectionNumber = scanner.nextBigDecimal();
        }

        pandemicDrawer(time, reproductionNumber, infectionNumber);
    }

    static void pandemicDrawer(int time, BigDecimal reproductionNumber, BigDecimal infectionNumber) {

        BigDecimal intensiveRate = new BigDecimal(1.7);
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal two = new BigDecimal(2);

        BigDecimal intensivePatients;
        BigDecimal intensiveOnRespirator;
        BigDecimal healedPatients = new BigDecimal(0);
        BigDecimal[] counter = new BigDecimal[time];

        for (int i = 0; i < time; i++) {
            infectionNumber = infectionNumber.multiply(reproductionNumber);
            intensivePatients = infectionNumber.divide(hundred).multiply(intensiveRate);
            intensiveOnRespirator = intensivePatients.divide(two);
            counter[i] = infectionNumber;

            if (i > 13) {
               healedPatients = counter[i - 14];
            }

            System.out.println("Day: " + i + " | Infections: " + infectionNumber + " | intensivePatients: " + intensivePatients + " | on O²: " + intensiveOnRespirator + " | Healed: " + healedPatients);
        }


    }
}
