package suchverfahren;

public class SearchingProcedures {
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 5, 9};
        int[] result = bubblesort(array);

        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] bubblesort(int array[]) {
        int number = array.length;
        int counter = 0;

        for(int i  = 0; i < number; i++) {
            for(int j = 1; j < (number - i); j++) {

                if(array[j-1] > array[j]) {
                    counter = array[j-1];
                    array[j-1] = array[j];
                    array[j] = counter;
                }
            }
        }
        return array;
    }
}
