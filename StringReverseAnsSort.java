import java.util.Scanner;
import java.util.StringTokenizer;

public class StringReverseAnsSort {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number of line: ");
    // int n = sc.nextInt();
    // if (n > 20) {
    // System.out.println("Number of line limit is 20");
    // System.exit(0);
    // }

    // String line[] = new String[n];
    // String s = "";
    // for (int i = 0; i < line.length; i++) {
    // line[i] = sc.nextLine();
    // if (line[i].length() > 80) {
    // System.out.println("Length of sentence should not be greater than 80");
    // i--;
    // }
    // }
    // for (int i = n-1; i >= 0; i--) {
    // StringTokenizer stz = new StringTokenizer(line[i],".,;:'");
    // while (stz.hasMoreTokens()) {
    // s=" "+stz.nextToken()+s;
    // }
    // }
    // System.out.println(s);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String st = sc.nextLine();
        String[] word = st.split(" ");
        for (int j = 0; j < word.length - 1; j++) {
            for (int j2 = 0; j2 < word.length - j - 1; j2++) {
                if (word[j2].length() > word[j2 + 1].length()) {
                    String rev = word[j2 + 1];
                    word[j2 + 1] = word[j2];
                    word[j2] = rev;
                }
            }
        }
        String s2 = "";
        int flag = 0;
        for (int j = 0; j < word.length; j++) {
            String ocr = "";
            flag = 0;
            for (int j2 = j + 1; j2 < word.length - 1; j2++) {
                if (word[j].length() == word[j2].length()) {
                    flag = 1;
                    if (st.indexOf(word[j]) < st.indexOf(word[j2]))
                        ocr = word[j];
                }
            }
            if (flag == 0)
                s2 += word[j] + " ";
            else
                s2 += ocr + " ";

        }

        System.out.println("Result: " + s2);
    }
}
