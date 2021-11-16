package bwinf2021.scale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        //Angeben des Paths der Datei aus der die Gewichtsstücke gelesen werden
        System.out.println("Filepath");
        File file = new File(scanner.nextLine());
        scanner = new Scanner(file);

        int weightNumbers[][] = new int[100][100];
        int number = 1;

        //Einleseprozess der Daten
        for (int i = 0; i < number; i++) {

            if (i == 0) {
                int numberOfWeights = scanner.nextInt();
                number = numberOfWeights;
            }

            String line = scanner.next();
            String line2 = scanner.next();
            weightNumbers[i][i] = Integer.parseInt(line);
            weightNumbers[i][i+1] = Integer.parseInt(line2);
        }
        //Aufruf der unteren Methode
        weightAlgorithm(weightNumbers, number);
    }

    //Methode für den Algorithmus zur Berechnung der Gewichtsstücke
    public static void weightAlgorithm(int[][] weightNumbers, int numberOfweights) {

        int weightGeneral = 0;
        int weightMax = 0;

        for (int i = 0; weightGeneral < 10001; i++) {

            weightGeneral = weightGeneral + 10;

            //Ermittlung des Maximalen Gewichts
            for (int j = 0; j < numberOfweights; j++) {
                if (weightNumbers[j][j] < weightGeneral || (weightNumbers[j][j] * weightNumbers[j][j+1]) < weightGeneral) {
                    weightMax = weightNumbers[j+1][j+1];
                    if (j == numberOfweights - 1) {
                        weightMax = weightNumbers[j][j];
                    }
                } else {
                    break;
                }
            }

            /*Ausgabe Nachrichten der Prüfung der Gewichte in Relation mit den Gewichtsstücken
              Hier aber nur ein Abgleich mit den Maximalgewichtstück. Die Lösung zur Prüfung aller Gewichte gibt es leider nicht
             */
            if (weightMax == weightGeneral) {
                System.out.println("-------- Untersuchung [" + weightGeneral + "g] --------" + "\n" + "Gewicht erzielbar" + "\n" + "L: " + weightGeneral + " || " + "R: " + weightMax + "g");
            } else {
                System.out.println("-*-*-*-*- Untersuchung [" + weightGeneral + "g] -*-*-*-*-" + "\n" + "Gewicht vielleicht erzielbar" + "\n" + "L: " + weightGeneral + "g || " + "R: XXXXXg");
            }
        }
    }
}
