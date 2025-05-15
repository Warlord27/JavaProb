import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class RandomWordMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String wor = sc.next().toUpperCase();
        int c = wor.length();
        Random rG = new Random(); // Changed object name to rG
        HashSet<String> WordList = new HashSet<>(); // Changed object name to WordList

        // Generate all possible unique random words
        while (WordList.size() < factorial(c)) {
            StringBuilder randomWord = new StringBuilder(wor);
            StringBuilder Shuf = new StringBuilder(); // Changed object name to Shuf

            while (randomWord.length() > 0) {
                int randomIndex = rG.nextInt(randomWord.length());
                Shuf.append(randomWord.charAt(randomIndex));
                randomWord.deleteCharAt(randomIndex);
            }

            WordList.add(Shuf.toString());
        }

        // Print all unique random words
        System.out.println("Unique random words generated from the input word:");
        int count = 1;
        for (String word : WordList) {
            System.out.println(count + "      " + word);
            count++;
        }
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
