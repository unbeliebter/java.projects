package kursarbeit;

public class Mouse {

    public static int speed;
    public static boolean isLiving;
    private static String food;

    public Mouse(int speed, boolean isLiving, String food) {
        Mouse.speed = speed;
        Mouse.isLiving = isLiving;
        setFood(food);
    }

    public static String getFood() {
        return food;
    }

    public static void setFood(String food) {
        Mouse.food = food;
    }
}
