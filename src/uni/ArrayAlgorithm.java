package uni;

import java.io.*;
import java.util.Scanner;

public class ArrayAlgorithm {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Dateipfad ein, um die folgende Datei einzulesen.");

        String path = scanner.nextLine();

        double[] numbers;
        numbers = einlesen(path);
        numbers = minMax(numbers);
        ausgabe(numbers);

    }

    public  static double[] einlesen(String datei) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(datei));

        double[] numbers = new double[100];

        String line = "";
        int number = 0;
        int counter = 0;
        try {
            while ((line = reader.readLine()) != null) {
                number = Integer.parseInt(line);
                numbers[counter] = number;
                counter++;
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }
        int backup = (int) numbers[0];
        numbers[0] = counter;
        numbers[counter] = backup;
        return numbers;
    }

    public  static double[] minMax (double[] feld) {
        int counter = 0;
        counter = (int) feld[0];
        int min = 100000000;
        int max = 0;

        double[] returnArray = new double[2];

        for (int i = 1; i < counter + 1; i++) {
            if (feld[i] > max) {
                max = (int) feld[i];
                returnArray[1] = max;
            }

            if (feld[i] < min) {
                min = (int) feld[i];
                returnArray[0] = min;
            }
        }

        return returnArray;
    }

    public static void ausgabe(double[] result) {
        System.out.println("Der kleinste Wert ist " + result[0] + " und der größte Wert ist " + result[1]);
    }
}
