package uni;

// 5, 1
import java.util.Scanner;

public class ModuloCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein!");
        int number = scanner.nextInt();

        int result = fMod3(number);
        System.out.println(number + " % 3 = " + result);
    }

    public static int fMod3(int number) {
        return number % 3;
    }
}
