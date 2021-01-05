package suchverfahren;

public class SearchingProcedures {
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 5, 9};
        int[] result = bubblesort(array);

        System.out.println(java.util.Arrays.toString(result));
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
}
