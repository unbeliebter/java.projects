package pandemicCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InfectionsCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t→ Gebe den Zeitraum an: ( > 1 in d)");
        int time = scanner.nextInt();

        if (time < 0) {
            System.out.println("Die Zahl ist leider zu klein und muss über 0 liegen!");
            time = scanner.nextInt();
        }

        System.out.println("\t→ Gebe die Reproduktionszahl an: ( > 1) ");
        BigDecimal reproductionNumber = scanner.nextBigDecimal();

        System.out.println("\t→ Gebe die aktiven Infektionen an (>0)");
        BigDecimal infectionNumber = scanner.nextBigDecimal();

        BigDecimal zero = new BigDecimal(0);

        if (infectionNumber.compareTo(zero) < 0) {
            System.out.println("Die Zahl ist leider zu klein und muss über 0 liegen!");
            infectionNumber = scanner.nextBigDecimal();
        }

        pandemicDrawer(time, reproductionNumber, infectionNumber);
        System.out.println("These information are based on a constantly reproducion number and doesn't display real numbers!");
    }

    static void pandemicDrawer(int time, BigDecimal reproductionNumber, BigDecimal infectionNumber) {

        String output = "";

        BigDecimal intensivePatients;
        BigDecimal intensiveOnRespirator;

        BigDecimal healedPatients = new BigDecimal(0);
        BigDecimal[] counter = new BigDecimal[time];

        BigDecimal activeInfections = new BigDecimal(0);
        BigDecimal difference;

        for (int i = 0; i < time; i++) {
            infectionNumber = infectionNumber.multiply(reproductionNumber);
            intensivePatients = activeInfections.divide(new BigDecimal(100), RoundingMode.DOWN).multiply(new BigDecimal(1.7));
            intensiveOnRespirator = intensivePatients.divide(new BigDecimal(2), RoundingMode.DOWN);
            counter[i] = infectionNumber;

            if (i > 0) {
                difference = infectionNumber.subtract(counter[i-1]);
            } else {
                difference = infectionNumber;
            }

            if (i > 13) {
               healedPatients = counter[i - 14];
               activeInfections = activeInfections.subtract(healedPatients).add(difference);

            } else if (i > 0){
                activeInfections = infectionNumber;
            }

            output = "_______________________________________________________________ \n" +
                    "Day: " + i + " \n" +
                    "Infections Total » " + infectionNumber.setScale(1, BigDecimal.ROUND_HALF_DOWN) + " \n" +
                    "Active Infections » " + activeInfections.setScale(1, BigDecimal.ROUND_HALF_DOWN) + " \n" +
                    "Healed Patients » " + healedPatients.setScale(1, BigDecimal.ROUND_HALF_DOWN) + " \n" +
                    "Intensive Patients » " + intensivePatients.setScale(1, BigDecimal.ROUND_HALF_DOWN) + " \n" +
                    "On Respirator » " + intensiveOnRespirator.setScale(1, BigDecimal.ROUND_HALF_DOWN)+ " \n" +
                    "_______________________________________________________________";
            System.out.println(output);
            }


    }
}
