package Calculator;

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
        double reproductionNumber = scanner.nextDouble();

        System.out.println("Gebe die aktiven Infektionen an (>0)");
        double infectionNumber = scanner.nextInt();

        if (infectionNumber < 0) {
            System.out.println("Die Zahl ist leider zu klein und muss über 0 liegen!");
            infectionNumber = scanner.nextInt();
        }

        pandemicDrawer(time, reproductionNumber, infectionNumber);
    }

    static void pandemicDrawer(int time, double reproductionNumber, double infectionNumber) {

        double intensivePatients;
        double intensivePationsOnRaspirator;
        double healedPatients;
        double[] counter = new double[14];

        for (int i = 0; i < time; i++) {
            infectionNumber = infectionNumber * reproductionNumber;
            intensivePatients = (infectionNumber / 100) * 1.7;
            System.out.println("Day: " + i + " | Infections: " + (int)infectionNumber + " | intensivePatients: " + (int)intensivePatients);
        }


    }
}
