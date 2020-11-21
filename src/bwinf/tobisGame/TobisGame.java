package bwinf.tobisGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TobisGame {
    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<>();

        System.out.println("→ Gebe Pfad der Datei an:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        System.out.println("→ Wiederholungen: (für die Liga-Variante)");
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

        Object resultLigaObj = liga(players,repetitions);
        int resultLiga = Integer.valueOf((String) resultLigaObj);
        int resultCompetetive = competetiveSystem(players);

        if (resultLiga < resultCompetetive) {
            System.out.println("____________________________________________________" + "\n" +
                    "In diesem Fall ist die K.O.-Variante bessser, um die Stärken zu ermitteln." + "\n" +
                    "Der Gewinner ist der Spieler mit der Stärke " + resultCompetetive + "." + "\n" +
                    "____________________________________________________");
        } else {
            System.out.println("____________________________________________________" + "\n" +
                    "In diesem Fall ist die Liga-Variante besser, um die Stärken zu ermitteln." + "\n" +
                    "Der Gewinner ist der Spieler mit der Stärke " + resultLiga + "." + "\n" +
                    "____________________________________________________");
        }
    }

    public static Object liga(ArrayList players, int repetitions) {

        ArrayList<String> wins = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            wins.add(i, "0");

        }

        Object playerOne;
        Object playerTwo;
        int strengthOfPlayerOne;
        int strengthOfPlayerTwo;
        int playerPositionOne;
        int playerPositionTwo;
        int winNumber;
        int winner = 0;

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
            winner = wins.indexOf(winnerOfLiga);
        }
        return players.get(winner);
    }

    public static int competetiveSystem(ArrayList players) {

        Object playerOne;
        Object playerTwo;
        Object winningPlayer;
        int strengthOfPlayerOne;
        int strengthOfPlayerTwo;
        int counter = 0;
        int winNumber;

        while (1 < players.size()) {
            playerOne = players.get(counter);
            strengthOfPlayerOne = Integer.valueOf((String) playerOne);

            playerTwo = players.get(counter + 1);
            strengthOfPlayerTwo = Integer.valueOf((String) playerTwo);

            double randomNumber = Math.random() * (strengthOfPlayerOne + strengthOfPlayerTwo);

            if (randomNumber < strengthOfPlayerTwo) {
                players.remove(counter);
            } else if (randomNumber > strengthOfPlayerOne) {
                players.remove(counter+1);
            }

            if (counter > players.size()) {
                counter = 0;
            }

        }
        winningPlayer = players;
        winNumber = Integer.parseInt(winningPlayer.toString().replace("[", "" ).replace("]", ""));
        return winNumber;
    }
}
