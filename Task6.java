import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String filePath = "words.txt"; // Put your file path here
        ArrayList<String> words = new ArrayList<>();

        // Read words from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    words.add(line.trim().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file: " + filePath);
            return; // Stop program if file not found
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file.");
            return;
        }

        if (words.isEmpty()) {
            System.out.println("No words found in the file.");
            return;
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println(" Welcome to Java Hangman ");
        System.out.println("************************");

        // GAME LOOP
        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            String input = scanner.next().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Wrong guess! Attempts left: " + (6 - wrongGuesses));
            }
        }

        if (wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    // HANGMAN ART
    static String getHangmanArt(int wrongGuesses) {
        switch (wrongGuesses) {
            case 0:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "      |\n" +
                      "      |\n" +
                      "      |\n" +
                      "      |\n" +
                      "=========";
            case 1:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      "      |\n" +
                      "      |\n" +
                      "      |\n" +
                      "=========";
            case 2:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      "  |   |\n" +
                      "      |\n" +
                      "      |\n" +
                      "=========";
            case 3:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      " /|   |\n" +
                      "      |\n" +
                      "      |\n" +
                      "=========";
            case 4:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      " /|\\  |\n" +
                      "      |\n" +
                      "      |\n" +
                      "=========";
            case 5:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      " /|\\  |\n" +
                      " /    |\n" +
                      "      |\n" +
                      "=========";
            case 6:
                return 
                      "  +---+\n" +
                      "  |   |\n" +
                      "  O   |\n" +
                      " /|\\  |\n" +
                      " / \\  |\n" +
                      "      |\n" +
                      "=========";
            default:
                return "";
        }
    }
}