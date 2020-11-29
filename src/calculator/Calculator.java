package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die erste Zahl an!");
        double numberOne = scanner.nextDouble();

        System.out.println("Geben sie die zweite Zahl an!");
        double numberTwo = scanner.nextDouble();

        String output = "Ergebnisse: " + "\n" +
                "Addition: " + addition(numberOne, numberTwo) + "\n" +
                "Subtraktion: " + subtraction(numberOne, numberTwo) + "\n" +
                "Multiplikation: " + multiplication(numberOne, numberTwo) + "\n" +
                "Division: " + divison(numberOne, numberTwo) + "\n";

        System.out.println(output);
    }

    public static double addition(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public static double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public static double divison(double numberOne, double numberTwo) {
        return  numberOne / numberTwo;
    }
}
