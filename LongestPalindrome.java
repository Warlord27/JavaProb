import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String st = sc.nextLine().toLowerCase().trim();
         if (st == null || st.length() < 1)
        {
            System.out.println("St length error ");
            System.exit(0);
        }
        String Lp = "", wrd;
        for (int i = 0; i < st.length(); i++) {

            for (int j = i+1; j <= st.length()-1; j++) {
                wrd = st.substring(i, j);

                StringBuilder sb = new StringBuilder(wrd);
               if(wrd.equals(sb.reverse().toString())){
                if(Lp.length()<wrd.length())
                Lp=sb.reverse().toString();
               }

            }

        }
        System.out.println("Longest Palindrome: "+Lp);
    }
}

// public class LongestPalindrome {
//     public static String longestPalindrome(String s) {
//         if (s == null || s.length() < 1)
//             return "";

//         int start = 0, end = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int len1 = expandAroundCenter(s, i, i);
//             int len2 = expandAroundCenter(s, i, i + 1);
//             int len = Math.max(len1, len2);

//             if (len > end - start) {
//                 start = i - (len - 1) / 2;
//                 end = i + len / 2;
//             }
//         }
//         return s.substring(start, end + 1);
//     }

//     static int expandAroundCenter(String s, int left, int right) {
//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return right - left - 1;
//     }

//     public static void main(String[] args) {
//         System.out.println(longestPalindrome("babad"));
//         System.out.println(longestPalindrome("cbbd"));
//         System.out.println(longestPalindrome("racecar"));
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the word");
//         System.out.println(longestPalindrome(sc.nextLine().toLowerCase().trim()));
//     }
// }
