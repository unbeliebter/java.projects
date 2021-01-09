package motorcycleExcercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe den Namen des Motorrads an!");
        String name = scanner.next();

        System.out.println("Gebe den Kilometerstand an!");
        int kilometers = scanner.nextInt();

        System.out.println("Gebe die Liter des Tanks an!");
        double tank = scanner.nextDouble();

        System.out.println("Gebe den Verbrauch des Motorrads an!");
        double consumption = scanner.nextDouble();

        System.out.println("Gebe eine Länge einer Strecke an, die du gefahren bist!");
        double distance = scanner.nextDouble();

        System.out.println("Gebe den Preis des Sprits an!");
        double price = scanner.nextDouble();

        Motorcycle motorcycle = new Motorcycle(kilometers, tank, name, consumption);

        double resultCosts = costsPerDistance(motorcycle, distance, price);
        double resultRange = range(motorcycle);
        double resultRefill = refill(motorcycle, price);

        String output = "Das Motorrad " + motorcycle.name + " kostet für die Strecke von " + distance + "km " + resultCosts + "€." + "\n" +
                "Der Tank des Motorrads hat eine Reichweite von " + resultRange + "km. " + "\n" +
                "Das Motorrad voll zu tanken kostet " + resultRefill + "€." + "\n" +
                "Würde das Motorrad die Strecke fahren, so hätte es den Kilometerstand von " + (motorcycle.kilometers + distance) + "km";

        System.out.println(output);
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
