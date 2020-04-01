public class ForEach {
    public static void main(String[] args) {
        int[] firstArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;

        }

        for (int j: firstArray) {           // für jedes j ein first Array
            System.out.println(j);
        }
    }
}
