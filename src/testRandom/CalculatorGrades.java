package testRandom;

public class CalculatorGrades {
    public static void main(String[] args) {

        int[] grades = new int[] {1, 3, 4, 1, 1, 1, 2, 3, 1, 2, 1, 2, 3, 2};

        double result = 0.0;

        for (int i = 0; i < grades.length ; i++) {
            result = result + grades[i];
        }

        double average;
        average = result / 14;

        System.out.println(Math.round(average * 100) / 100.0);
    }
}
