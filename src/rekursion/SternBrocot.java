package rekursion;

public class SternBrocot {
    public static void main(String[] args) {

        System.out.println(S(1));
        System.out.println(S(2));
        System.out.println(S(3));
        System.out.println(S(4));
        System.out.println(S(5));

    }
    public static int S(int n) {
        int result = 0;

        if(n==0) {
            result = 0;
        } else if (n == 1) {
            result = 1;

        } else if (n%2==0) {
           result = S(n/2);

        } else {
            result = S((n-1)/2)  + S((n-1)/2+1);
        }

        return result;
    }
}
