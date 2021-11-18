package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private final String wordToFind = "alma";

    private String wordFound = "____";

    private int chances = 8;


    public static void main(String[] args) {

        new HangmanMain().run();

    }


    private void run() {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Itt tartassz: " + wordFound);
            System.out.println("Ennyi tipped van még: " + chances);
            System.out.print("Írd be a következő tippped: ");
            String guess = sc.nextLine();

            String s = updateWordFound(wordToFind, wordFound, guess);

            if (s.equals(wordFound))
                --chances;
            else wordFound = s;


        } while (!wordFound.equals(wordToFind) && chances > 0);

        if (wordFound.equals(wordToFind))
            System.out.println("Ügyes vagy!");
        else System.out.println("Vesztettél!");

    }


    private String updateWordFound(String wordToFind, String status, String guess) {

        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}
