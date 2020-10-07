package homework;

import java.util.Scanner;

public class KgV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("firstNumber");
        int firstNumber = scanner.nextInt();
        System.out.println("second number");
        int secondNumber = scanner.nextInt();

        int result = KGV(firstNumber, secondNumber);
        System.out.println(result);

    }

    public static int KGV(int firstNumber, int secondNumber) {
        int[] firstNumberArray = new int[1000];
        int[] secondNumberArray = new int[1000];

        int numberOne = 0;
        int numberTwo = 0;

        for (int i = 0; i < 1000; i++) {
            numberOne = numberOne + firstNumber;
            firstNumberArray[i] = numberOne;

            numberTwo = numberTwo + secondNumber;
            secondNumberArray[i] = numberTwo;
        }

        int counter = 0;
        String number1 = "";
        String number2 = "";

        while (true) {
            for (int i = 0; i < 1000; i++) {
                number1 = "" + firstNumberArray[counter];
                number2 = "" + secondNumberArray[i];

                if (number1.equalsIgnoreCase(number2)) {
                    return Integer.parseInt(number1);
                }
            }
            counter++;
        }
    }
}

