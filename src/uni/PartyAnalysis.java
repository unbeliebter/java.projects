package uni;

import java.util.Scanner;

public class PartyAnalysis {

    public static int anzParteien;
    public static int anzSitze;
    public static int[] anzStimmenPartei = new int[100];
    public static int[] anzSitzePartei = new  int[100];
    public static int[] divisors = new int[100];
    public static int allVotes;

    public static void main(String[] args) {
        einlesen();
        initialize();
        //maxIndex();
        ausgabe();
    }

    public static void einlesen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie die Anzahl der Parteien an.");
        anzParteien = scanner.nextInt();

        System.out.println("Geben sie die Anzahl der Sitze an.");
        anzSitze = scanner.nextInt();

        int input;
        System.out.println("Geben sie die Stimmen pro Partei an");
        for (int i = 0; i < anzParteien; i++) {
            input = scanner.nextInt();
            anzStimmenPartei[i] = input;
        }
    }

    public static void initialize() {
        int party = 0;
        int votes = 0;

        for (int i = 0; i < anzParteien; i++) {
            if (anzStimmenPartei[i] > votes) {
                votes = anzStimmenPartei[i];
                party = i;
            }
        }

        int allVotes = 0;
        for (int i = 0; i < anzParteien; i++) {
            allVotes = allVotes + anzStimmenPartei[i];
        }

        System.out.println("Die Partei mit den meisten Stimmen ist die " + (party + 1) + ". Partei mit " + votes + " Stimmen.");
    }

 /*   public static int maxIndex() {
        int divNumber = 0;
        int votes = 0;
        int runs = anzParteien;

        while (true) {
            divNumber++;
            break;
            for (int i = 0; i < runs; i++) {
                votes = anzStimmenPartei[i];
               if (votes / divNumber < 60) {
                   divisors[i] = divNumber;
                   runs =- 1;
               }
            }
        }
    }
    */
    public static void berechneSitze() {
        // umsetzung unklar
    }

    public static void ausgabe() {
        System.out.println("Es gibt " + anzParteien + " Parteien, die auf insgesamt " + anzSitze + " Sitze kommen." + "\n" + "Insgesamt gibt es " + allVotes + " Stimmen für alle Parteien." + "\n" + "Die Sitzverteilung im Parlament ist nun folgende: ");

        for (int i = 0; i < anzParteien; i++) {
            System.out.println("Partei " + i + ": " + anzSitzePartei[i] + " Sitze | " + anzStimmenPartei[i] + " Stimmen");
        }
    }
}
