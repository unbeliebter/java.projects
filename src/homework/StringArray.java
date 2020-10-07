package homework;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        String result = arrayToString(array);
        System.out.println(result);

    }

    public static String arrayToString(int[][] array) {

        String arrayString = "";

        for (int i = 0; array.length > i; i++) {
            array[i][i] = i;

            arrayString = "" + array[i][i];
        }

        return arrayString;
    }
}
