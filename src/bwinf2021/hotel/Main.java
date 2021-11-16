package bwinf2021.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Filepath");
        File file = new File(scanner.nextLine());
        scanner = new Scanner(file);

        int numberOfHotels = scanner.nextInt();
        int routeLength = scanner.nextInt();

        int i = 0;
        String[][] hotels = new String[numberOfHotels][numberOfHotels];

        while (scanner.hasNextLine()) {
            String reading = scanner.nextLine();
            System.out.println(reading);
            String[] strings = reading.split(" ");
            System.out.println(strings.length);

            String kilometer = strings[0];
            String rating = strings[1];
            System.out.println(rating);
            System.out.println(kilometer);
            hotels[i][i] = kilometer;
            //hotels[i][i+1] = rating;
            //System.out.println(hotels[i][i+1]);
        }
    }
}

