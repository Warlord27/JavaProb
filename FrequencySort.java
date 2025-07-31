import java.util.Scanner;
import java.util.StringTokenizer;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String st = sc.nextLine();
        st = st.replaceAll("[/\\?,\\.':;]", "").toLowerCase();

        while (!st.isBlank()) {
            StringTokenizer stz = new StringTokenizer(st);
            String word = stz.nextToken();
            int count = 1;

            while (stz.hasMoreTokens()) {
                if (stz.nextToken().equalsIgnoreCase(word)) {
                    count++;
                }
            }

            System.out.println(word + " : " + count);
            st = (" " + st + " ").replace(" " + word + " ", " ").trim();
        }
    }
}
