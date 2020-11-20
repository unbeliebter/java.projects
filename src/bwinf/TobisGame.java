package bwinf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TobisGame {
    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<>();

        System.out.println("Gebe Pfad ein:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        System.out.println("Wiederholungen:");
        int repetitions = scanner.nextInt();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            int amountofPlayers = Integer.parseInt(reader.readLine());

            for (int i = 0; amountofPlayers != i; i++) {
                players.add(reader.readLine());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        liga(players,repetitions);



    }

    public static void liga(ArrayList players, int repetitions) {

        ArrayList<String> wins = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            wins.add(i, "0");

        }

        Object playerOne = "";
        Object playerTwo = "";
        int strengthOfPlayerOne;
        int strengthOfPlayerTwo;
        int playerPositionOne;
        int playerPositionTwo;
        int winNumber;

        for (int k = 0; k < repetitions; k++) {

            for (int i = 0; i < players.size(); i++) {
                playerOne = players.get(i);
                strengthOfPlayerOne = Integer.valueOf((String) playerOne);
                playerPositionOne = i;

                for (int j = 0; j < players.size(); j++) {
                    playerTwo = players.get(j);
                    strengthOfPlayerTwo = Integer.valueOf((String) playerTwo);
                    playerPositionTwo = j;

                    double randomNumber = Math.random() * (strengthOfPlayerOne + strengthOfPlayerTwo);

                    if (randomNumber < strengthOfPlayerTwo) {
                        winNumber = Integer.parseInt(wins.get(playerPositionOne)) + 1;
                        wins.set(playerPositionOne, Integer.toString(winNumber));
                    } else if (randomNumber > strengthOfPlayerOne) {
                        winNumber = Integer.parseInt(wins.get(playerPositionTwo)) + 1;
                        wins.set(playerPositionTwo, Integer.toString(winNumber));
                    }

                }
            }
            String winnerOfLiga = Collections.max(wins);
            int winner = wins.indexOf(winnerOfLiga);

            System.out.println("WINNER:" + winner);

            System.out.println(wins + " | " + players);
        }
    }

}

//H:\java.projects\src\bwinf\spielstaerken.txt
