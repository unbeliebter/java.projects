package homework;

import java.util.Scanner;

public class HeronProceed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die Breite des Rechtecks ein:");
        double sideOne = scanner.nextDouble();
        System.out.println("Gebe die Höhe des Rechtecks ein:");
        double sideTwo = scanner.nextDouble();

        double result = HeronProceedMethod(sideOne, sideTwo);
        System.out.println("Das Quadrat hat folgende Maße: " + Math.round(result * 100) / 100.0);
    }

    public static double HeronProceedMethod(double sideOne, double sideTwo) {
        double startParameter = sideOne / 2;

        double heronNumber = (sideOne + sideTwo) / 2;
        double result = 0;

        for (int i = 0; i < startParameter; i++) {
            result = ((heronNumber + (sideOne / heronNumber)) / 2);
            heronNumber = result;
        }
        return result;
    }
}
