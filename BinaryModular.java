import java.util.Scanner;

public class BinaryModular {
    // Converts a string to its binary representation
    static String wordToBinary(String s) {
        StringBuilder binaryRepresentation = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int asciiValue = (int) s.charAt(i);
            String binary = Integer.toBinaryString(asciiValue); // Convert ASCII value to binary
            binaryRepresentation.append(binary).append(" ");
        }
        return binaryRepresentation.toString().trim();
    }

    // Converts a number to its binary representation
    static String numberToBinary(long s) {
        return Long.toBinaryString(s); // Directly convert number to binary
    }

    // Converts binary representation back to a string
    static String binaryToWord(String binary) {
        StringBuilder text = new StringBuilder();
        for (String bin : binary.split(" ")) {
            int asciiValue = Integer.parseInt(bin, 2); // Parse binary to integer
            text.append((char) asciiValue); // Convert ASCII value to character
        }
        return text.toString();
    }

    // Converts binary representation back to a number
    static long binaryToNumber(String binary) {
        return Long.parseLong(binary, 2); // Parse binary to long
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1. Encode a message to binary");
        System.out.println("2. Decode a binary message");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Encoding
            System.out.println("Enter the message (letters and numbers only, no punctuation): ");
            String s = sc.nextLine().toUpperCase(); // Read the entire line and convert to uppercase
            StringBuilder message = new StringBuilder();

            for (String token : s.split("\\s+")) { // Split input by spaces
                if (token.matches("\\d+")) { // Check if the token is a number
                    long num = Long.parseLong(token);
                    message.append(numberToBinary(num)).append(" ");
                } else {
                    message.append(wordToBinary(token)).append(" ");
                }
            }

            System.out.println("Binary Encoded Message: " + message.toString().trim());
        } else if (choice == 2) {
            // Decoding
            System.out.println("Enter the binary message to decode: ");
            String binaryMessage = sc.nextLine();
            StringBuilder decodedMessage = new StringBuilder();

            for (String token : binaryMessage.split("\\s+")) { // Split input by spaces
                if (token.matches("[01]+")) { // Check if the token is binary
                    try {
                        // Decode as a character
                        decodedMessage.append(binaryToWord(token)).append(" ");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary input: " + token);
                    }
                }
            }

            System.out.println("Decoded Message: " + decodedMessage.toString().trim());
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }
}