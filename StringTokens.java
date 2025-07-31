import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        String s = scan.nextLine();
         // Trim leading/trailing whitespace
        s = s.trim();

        // Check if the string is empty after trimming
        if (s.isEmpty()) {
            System.out.println(0);
            scan.close();
            return;
        }

        // Split the string by one or more non-alphabetic characters
        String[] tokens = s.split("[^a-zA-Z]+");

        // Count and print valid tokens (non-empty strings)
        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

        // Print each valid token
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        
        scan.close();
    }
}

