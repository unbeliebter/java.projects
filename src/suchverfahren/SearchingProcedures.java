package suchverfahren;

public class SearchingProcedures {
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 5, 9};

        int[] resultBubbleSort = bubblesort(array);
        int[] resultInsertionSort = insertionSort(array);
        int[] resultSelectionSort = selectionsort(array);
        System.out.println(java.util.Arrays.toString(resultBubbleSort) + "\n" +
                java.util.Arrays.toString(resultInsertionSort) + "\n" +
                java.util.Arrays.toString(resultSelectionSort));
    }

    public static int[] bubblesort(int[] array) {
        int number = array.length;
        int counter = 0;

        for(int i  = 0; i < number; i++) {
            for(int k = 1; k < (number - i); k++) {

                if(array[k-1] > array[k]) {
                    counter = array[k-1];
                    array[k-1] = array[k];
                    array[k] = counter;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] sortieren) {
        int temp;
        for (int i = 1; i < sortieren.length; i++) {
            temp = sortieren[i];
            int j = i;
            while (j > 0 && sortieren[j - 1] > temp) {
                sortieren[j] = sortieren[j - 1];
                j--;
            }
            sortieren[j] = temp;
        }
        return sortieren;
    }

    public static int[] selectionsort(int[] sortieren) {
        for (int i = 0; i < sortieren.length - 1; i++) {
            for (int j = i + 1; j < sortieren.length; j++) {
                if (sortieren[i] > sortieren[j]) {
                    int temp = sortieren[i];
                    sortieren[i] = sortieren[j];
                    sortieren[j] = temp;
                }
            }
        }

        return sortieren;
    }


}
