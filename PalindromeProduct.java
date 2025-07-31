import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeProduct {

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        String reversedS = new StringBuilder(s).reverse().toString();
        return s.equals(reversedS);
    }

    public static void main(String[] args) {
        // Use a Set to store unique palindromic products to avoid duplicates
        Set<Integer> palindromesSet = new HashSet<>();

        // Generate all palindromic products of two 3-digit numbers
        // We iterate from 999 down to 100 for both factors
        // This ensures we cover all possible products and helps with potential optimizations
        // (though for 3-digit numbers, brute-force is fast enough)
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) { // Start j from i to avoid duplicate pairs (e.g., 999*998 and 998*999)
                int product = i * j;
                // Products of two 3-digit numbers range from 100*100 = 10000 to 999*999 = 998001
                // We are interested in palindromes within this range.
                if (isPalindrome(product)) {
                    palindromesSet.add(product);
                }
            }
        }

        // Convert the Set to a List and sort it in ascending order
        // This allows for efficient searching later.
        List<Integer> sortedPalindromes = new ArrayList<>(palindromesSet);
        Collections.sort(sortedPalindromes);

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt(); // Input N for each test case
            int result = -1; // Initialize result to -1 (as per common competitive programming practice for "not found")

            // Find the largest palindrome less than N
            // Iterate through the sorted list of palindromes from largest to smallest.
            // This is efficient because the list is sorted.
            for (int k = sortedPalindromes.size() - 1; k >= 0; k--) {
                int currentPalindrome = sortedPalindromes.get(k);
                if (currentPalindrome < n) {
                    result = currentPalindrome;
                    break; // Once the first palindrome less than N is found, it's the largest.
                }
            }
            System.out.println(result);
        }
        in.close(); // Close the scanner to prevent resource leaks
    }
}
