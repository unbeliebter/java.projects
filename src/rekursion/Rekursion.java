package rekursion;

public class Rekursion {
    public static void main(String[] args) {
        int number = 3;
        int result = rekursionfunc(number);
        int resultTwo = rekursionIterative(number);

        System.out.println("Rekursiv:" + result);
        System.out.println("Iterativ:" + resultTwo);
    }

    public static int rekursionfunc(int number) {
        int result = 0;

        if (number == 1 || number < 1) {
            return 1;
        } else {
            result = rekursionfunc(number-1) + ((3 * number) * (rekursionfunc(number-1))) + 1;
        }
        return result;
    }

    public static int rekursionIterative(int number) {
        int result;
        int resultLast = 0;
        for (int i = 0; i < number + 1; i++) {
            result = 3 * number + number;
            resultLast=+result;
        }
        return resultLast;
    }
}
