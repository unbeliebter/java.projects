package kursarbeit;

public class Cat {

    public static int amountOfFeets;
    public static boolean hungry;

    public Cat(int amountOfFeets, boolean hungry) {
        Cat.amountOfFeets = amountOfFeets;
        Cat.hungry = hungry;
    }

    public void catEatsMouse() {
        Cat.hungry = false;
    }
}
