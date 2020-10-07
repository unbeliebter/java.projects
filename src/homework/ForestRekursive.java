package homework;

public class ForestRekursive {
    public static void main(String[] args) {

        double forestVolume = 60000;
        double result = ForestRekursiveMethod(forestVolume);
        System.out.println(result);

    }

    public static double ForestRekursiveMethod (double forestVolume) {

       double result = forestVolume;

        while (true) {
            result = result * 1.05 - 3500;
            System.out.println(result);

            if (result < 1) {
                return 1;
            }
        }
    }
}
