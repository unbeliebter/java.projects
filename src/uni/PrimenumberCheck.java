//Kapitel 4, Ag.11
package uni;

public class PrimenumberCheck {
    public static void main(String[] args) {

        int number = 4711;
        int counter = 2;
        boolean isPrimenumber = true;

        while (counter < number) {
            if (number % counter == 0) {
                isPrimenumber = false;
                break;
            } else {
                ++counter;
            }
        }

        if (!isPrimenumber) {
            System.out.println(number + " ist keine Primzahl!");
        } else {
            System.out.println(number + " ist Primzahl!");
        }

    }
}
