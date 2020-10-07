package bwinf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TobisGame {
    public static void main(String[] args) {

        System.out.println("Gebe Pfad ein:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));

            int playerNumber = Integer.parseInt(reader.readLine());
            int[][] player = new int[playerNumber][playerNumber];

            for (int i = 0; playerNumber != i; i++) {

                player[i][i] = Integer.parseInt(reader.readLine());
            }

            int[] ligaWinProbabilatiy = new int[] {liga(player, playerNumber)};
            System.out.println(ligaWinProbabilatiy[0]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int liga (int[][] player, int playerNumber) {

        int[] randomNumber = new int[playerNumber];
        int j = 0;

        for (int i = 0; i != playerNumber-1; i++) {

            randomNumber[0] = player[i][j] + player[i+1][j+1];
            int randomNumberInt = randomNumber[0];
            int number = (int) Math.round(Math.random()*randomNumberInt);

            if (number > player[i][j]) {
          //      player[i+1][j+1] =
            }

            System.out.println(number);
        }



        return 1;

    }




}
