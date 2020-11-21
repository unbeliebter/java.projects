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
        System.out.println(finalText);

    }

    public static void findWords(String searchLine, String words) {
        String[] searchedWord = searchLine.split(" ");
        String[] word = words.split(" ");
        int lengthOfSearchedWord;
        int lengthOfWord;

        for (int i=0; i<searchedWord.length; i++) {
            String[] searchedWordLetters = searchedWord[i].split("");
            lengthOfSearchedWord = countMissingChars(searchedWord[i]);

            int[] posOfLetter = searchLetters(searchedWordLetters, lengthOfSearchedWord, "^[a-zA-Z]*$");

            for (int j=0; j< word.length; j++) {
                String[] wordLetters = word[j].split("");
                lengthOfWord = wordLetters.length;

                if (lengthOfWord == lengthOfSearchedWord) {
                    if (posOfLetter[0] >= 0) {
                        for (int pos : posOfLetter) {
                            if (wordLetters[pos].equalsIgnoreCase(searchedWordLetters[pos])) {
                                replaceInFinalText(word[j], i);
                            }
                        }
                    }else {
                        if (lengthOfSearchedWord == lengthOfWord) {
                            replaceInFinalText(word[j], i);
                            break;
                        }
                    }
                }
            }
        }

    }

    public static int[] searchLetters(String[] word, int length, String regex){
        int[] positions = new int[length+1];
        positions[0] = -1;
        int i = 0;
        int pos = 0;
        for (String letter : word){
            if (letter.matches(regex)) {
                positions[i] = pos;
                i++;
            }
            pos++;
        }
        return positions;
    }

    public static void setFinalText(String text){
        finalText =  text;
    }

    public static int countMissingChars(String word){
        int count = 0;
        String[] chars = word.split("");
        for (int i=0; i<chars.length; i++) {
            if (chars[i].matches("^[a-zA-Z]*$") || chars[i].equals("_")) {
                count++;
            }
        }
        return count;
    }

    public static void replaceInFinalText(String newText, int pos){
        String text = finalText;
        String[] oldText = finalText.split(" ");
        boolean specialCharacter = oldText[pos].length() == newText.split("").length;

        if (!specialCharacter){
            String[] character = oldText[pos].split("");
            int[] positions = searchLetters(character, character.length,"[,.;:!?]");
            newText = newText + character[positions[0]];
            text = text.replaceAll(oldText[pos], newText);
        }else{
            text = text.replaceAll(oldText[pos], newText);
        }

        setFinalText(text);
    }

}
//H:\java.projects\src\bwinf\Woerter\raetsel0.txt