package kursarbeit;

public class Fibonacci {
    public static void main(String[] args) {
        int step = 17;
        int[] cache = new int[step + 1];
        cache[0] = 1;
        cache[1] = 1;
        System.out.println(fibonacciMethod(step, cache));
    }

    public static int fibonacciMethod(int number, int[] cache) {
        int result = 0;

        if (number != 0 && number != 1) {
            cache[number] = fibonacciMethod(number - 1, cache) + cache[number - 2];
            result = cache[number];
        } else {
            result = 1;
        }
        return result;
    }
}
