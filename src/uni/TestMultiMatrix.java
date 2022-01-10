package uni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestMultiMatrix {
    public static void main(String[] args) throws IOException {

        int[] vector;
        int[][] matrix;
        vector = einlesenVektor(args[0]);
        matrix = einlesenMatrix(args[1]);
        boolean compatibility = testCompatibility(vector, matrix);

        if (compatibility) {
            System.out.println("Vektor und Matrix sind kompatibel.");
        } else {
            System.out.println("Vektor und Matrix sind nicht kompatibel.");
            System.exit(-1);
        }

        int[] vectorResult;
        vectorResult = multiplikation(vector, matrix);
        auslesenVector(vectorResult, args[0]);
    }

    public static int[] einlesenVektor(String datei) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(datei));

        int result = 0;
        int number = 0;
        String line = reader.readLine();

        number = Integer.parseInt(line);
        int[] vektor = new int[number];

        for (int i = 0; i < number ; i++) {
            line = reader.readLine();
            result = Integer.parseInt(line);
            vektor[i] = result;
        }

        return vektor;
    }

    public static int[][] einlesenMatrix(String datei) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(datei));

        int length = 0;
        String line = reader.readLine();
        length = Integer.parseInt(line);
        line = reader.readLine();
        int spalten = Integer.parseInt(line);

        int[][] matrix = new int[spalten + 1][length];
        matrix[0][0] = spalten;

        return matrix;

    }

    public static boolean testCompatibility(int[] vect, int[][] mat) {
        return vect.length == mat[0][0];
    }

    public static void auslesenVector(int[] vector, String ausDat) throws IOException {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static int[] multiplikation(int[] vect, int[][] mat) {

        int vectorNumber = 0;
        int numberOfMatrix = 0;
        int result = 0;

        for (int i = 0; i < mat[0][0]; i++) {
            vectorNumber = vect[i];
            for (int j = 0; j < mat[0][0]; j++) {
                numberOfMatrix = mat[i][j];
                result = result + (vectorNumber * numberOfMatrix);
            }
            vect[i] = result;
        }
        return vect;
    }
}
