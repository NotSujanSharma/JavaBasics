import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Hangman {
    private static String word = "programming"; // The word to guess
    private static String hiddenWord = new String(new char[word.length()]).replace("\0", "_");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (count < 7 && hiddenWord.contains("_")) {
            System.out.println("Guess any letter in the word");
            System.out.println(hiddenWord);
            String guess = scanner.next();

            hang(guess);
        }
        scanner.close();
    }

    public static void hang(String guess) {
        String newHiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newHiddenWord += guess.charAt(0);
            } else if (hiddenWord.charAt(i) != '_') {
                newHiddenWord += word.charAt(i);
            } else {
                newHiddenWord += "_";
            }
        }

        if (hiddenWord.equals(newHiddenWord)) {
            count++;
            hangmanImage();
        } else {
            hiddenWord = newHiddenWord;
        }
        if (hiddenWord.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |--------");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |        O");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println();
        }
        // ... additional hangman states
        if (count == 4) {
            System.out.println("GAME OVER!");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |        O");
            System.out.println("   |       /|");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 5) {
            System.out.println("GAME OVER!");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |        O");
            System.out.println("   |       /|\\");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 6) {
            System.out.println("GAME OVER!");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |        O");
            System.out.println("   |       /|\\");
            System.out.println("   |       /");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("GAME OVER! The word was " + word);
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   |--------|");
            System.out.println("   |        |");
            System.out.println("   |        O");
            System.out.println("   |       /|\\");
            System.out.println("   |       / \\");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}
