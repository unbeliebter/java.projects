package suchverfahren;

public class SearchingProcedures {
    public static void main(String[] args) {
        int[] array = {3, 4, 8, 9, 19, 34, 133};
        int key = 19;

        int[] resultBubbleSort = bubblesort(array);
        int[] resultInsertionSort = insertionSort(array);
        int[] resultSelectionSort = selectionsort(array);
        int resultSequentielSearch = sequentielSearch(array, key);
        int resultBinarySearch = binarySearch(array, key);

        System.out.println("BubbleSort: " + java.util.Arrays.toString(resultBubbleSort) + "\n" +
                "InsertionSort: " + java.util.Arrays.toString(resultInsertionSort) + "\n" +
                "SelectionSort: " + java.util.Arrays.toString(resultSelectionSort) + "\n" +
                "Sequentielle Suche: " + resultSequentielSearch + "\n" +
                "Binäre Suche: Das Element befindet sich auf Position " + resultBinarySearch);
    }

    public static int[] bubblesort(int[] array) {
        int number = array.length;
        int counter = 0;

        for (int i = 0; i < number; i++) {
            for (int k = 1; k < (number - i); k++) {

                if (array[k - 1] > array[k]) {
                    counter = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = counter;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int counter;
        for (int i = 1; i < array.length; i++) {
            counter = array[i];

            int place = i;

            while (place > 0 && array[place - 1] > counter) {
                array[place] = array[place - 1];
                place--;
            }
            array[place] = counter;
        }
        return array;
    }

    public static int[] selectionsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int counter = array[i];
                    array[i] = array[j];
                    array[j] = counter;
                }
            }
        }
        return array;
    }

    public static int sequentielSearch(int[] array, int key) {
        int counter = 0;

        for (int i = 0; counter <= array.length; i++) {

            if (array[counter] == key) {
                counter = key;
                break;
            } else {
                counter++;
                if (counter > array.length) {
                    counter = -1;
                    break;
                }
            }
        }
        return counter;
    }

    public static int binarySearch(int[] array, int parameterOfArray) {
        return java.util.Arrays.binarySearch(array, parameterOfArray);
    }

}
