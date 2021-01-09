package motorcycleExcercise;

public class Main {
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle(2352, 8.4, "Flitzer", 2.5);

        double distance = 222;
        double price = 1.20;

        double resultCosts = costsPerDistance(motorcycle, distance, price);
        double resultRange = range(motorcycle);
        double resultRefill = refill(motorcycle, price);

        System.out.println(resultCosts + " " + resultRange + " " + resultRefill);
    }

    public static double costsPerDistance(Motorcycle motorcycle, double distance, double price) {
        return ((distance / 100) * motorcycle.consumption) * price;
    }

    public static double range(Motorcycle motorcycle) {
        return (motorcycle.tank / motorcycle.consumption) * 100;
    }

    public static double refill(Motorcycle motorcycle, double price) {
        return motorcycle.tank * price;
    }
}