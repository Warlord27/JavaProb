import java.util.Scanner;

public class LongestSubString {

    boolean similarity(String st) {
        for (int i = 0; i < st.length(); i++) {
            int con = 0;
            for (int j = i; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j))
                    con++;
            }
            if (con > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongestSubString ob = new LongestSubString();

        System.out.println("Enter a Word: ");
        String st = sc.next().toLowerCase();
        String subf = "";
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length() - 1; j++) {
                // String sub = st.substring(i, j);
                // String sub = st.charAt(i) + st.substring(j) + st.substring(0, i);
                String sub = st.substring(i,j) + st.substring(0, i);
                // if (sub.length() > subf.length() && ob.similarity(st)) {
                // System.out.println(""+i+j+" "+sub);
                // subf = sub;
                // }
                System.out.println("Adam :      "+ sub);


                if (ob.similarity(sub) && sub.length() > subf.length()) {
                    System.out.println("Helooo :  " + sub);
                    subf=sub;
                }
            }
            // System.out.println(subf);
        }
        // System.out.format("Longest Word:", subf, " Length: ", subf.length());
        System.out.println(subf);
    }
}
