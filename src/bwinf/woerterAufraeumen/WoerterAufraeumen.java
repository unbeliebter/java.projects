package bwinf.woerterAufraeumen;

import java.io.*;
import java.util.Scanner;

public class WoerterAufraeumen {

    public static String finalText = "";

    public static void main(String[] args) {
        System.out.println("→ Gebe Pfad der Datei an:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        String searchLine = "";
        String words = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            searchLine = reader.readLine();
            finalText = searchLine;
            words = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        findWords(searchLine, words);

        String output = "_________________________________________________________________________________" + "\n" +
                "Lückentext: " + searchLine + "\n" +
                "Wörter: " + words + "\n" +
                "_________________________________________________________________________________" + "\n" +
                "Lösung: " + finalText + "\n" +
                "_________________________________________________________________________________";

        System.out.println(output);

    }

    public static void findWords(String searchLine, String words) {
        String[] searchedWord = searchLine.split(" ");
        String[] word = words.split(" ");
        int lengthOfSearchedWord;
        int lengthOfWord;

        for (int i = 0; i < searchedWord.length; i++) {
            String[] searchedWordLetters = searchedWord[i].split("");
            lengthOfSearchedWord = countMissingChars(searchedWord[i]);

            int[] positionOfLetter = searchLetters(searchedWordLetters, lengthOfSearchedWord, "^[a-zA-Z]*$");

            for (int j = 0; j < word.length; j++) {
                String[] wordLetters = word[j].split("");
                lengthOfWord = wordLetters.length;

                if (lengthOfWord == lengthOfSearchedWord && positionOfLetter[0] >= 0) {
                        for (int position : positionOfLetter) {
                            if (wordLetters[position].equalsIgnoreCase(searchedWordLetters[position])) {
                                replaceInFinalText(word[j], i);
                            }
                        }
                    } else if (lengthOfSearchedWord == lengthOfWord) {
                            replaceInFinalText(word[j], i);
                            break;
                }
            }
        }
    }

    public static int[] searchLetters(String[] word, int length, String regexString) {
        int[] positions = new int[length + 1];
        positions[0] = -1;

        int counter = 0;
        int position = 0;

        for (String letter : word) {
            if (letter.matches(regexString)) {
                positions[counter] = position;
                counter++;
            }
            position++;
        }
        return positions;
    }

    public static int countMissingChars(String word) {
        int counter = 0;
        String[] charString = word.split("");

        for (int i = 0; i < charString.length; i++) {
            if (charString[i].matches("^[a-zA-Z]*$") || charString[i].equals("_")) {
                counter++;
            }
        }
        return counter;
    }

    public static void replaceInFinalText(String newText, int pos){
        String text = finalText;
        String[] oldText = finalText.split(" ");
        boolean specialCharacter;

        if (oldText[pos].length() == newText.split("").length) {
            specialCharacter = true;
        } else {
            specialCharacter = false;
        }

        if (!specialCharacter) {
            String[] character = oldText[pos].split("");
            int[] positions = searchLetters(character, character.length,"[,.;:!?]");

            newText = newText + character[positions[0]];
            text = text.replaceAll(oldText[pos], newText);
        } else {
            text = text.replaceAll(oldText[pos], newText);
        }
        finalText = text;
    }
}
//H:\java.projects\src\bwinf\Woerter\raetsel0.txt