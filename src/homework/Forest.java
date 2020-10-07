package homework;

import java.util.Scanner;

public class Forest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Größe des Waldes (ha)");
        double forest = scanner.nextDouble();
        System.out.println("Gebe ein Jahr an (> 2020)");
        int year = scanner.nextInt();

        if (year < 2020) {
            System.exit(-1);
        }

        double forestVol = forestVolume(forest, year);
        System.out.println(Math.round(forestVol * 100) / 100.0 + " ha");

    }

    public static double forestVolume(double forest, int year) {

        for (int i = 2020; i != year; i++) {
            forest = ((forest / 100)*5) - 3500 + forest;
        }
        return forest;
    }
}
