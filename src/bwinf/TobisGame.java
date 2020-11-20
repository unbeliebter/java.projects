package bwinf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TobisGame {
    public static void main(String[] args) {

        System.out.println("Gebe Pfad ein:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        HashMap<String, String> players = new HashMap<String, String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            int amountofPlayers = Integer.parseInt(reader.readLine());

            for (int i = 0; amountofPlayers != i; i++) {

                players.put(Integer.toString(i), reader.readLine());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(players);
    }
}
