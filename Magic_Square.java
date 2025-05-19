import java.util.Scanner;

public class Magic_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the length of N: ");
        int n = sc.nextInt(), M[][] = new int[n][n], r, c, rs = 0, ls = 0, cols = 0, rows = 0, s1 = 0;
        for (r = 0; r < n; r++) {
            for (c = 0; c < n; c++) {
                System.out.println("Enter number: ");
                M[r][c] = sc.nextInt();
            }
        }

        for (r = 0; r < n; r++) {
            rs += M[r][r];
            ls += M[r][n - r - 1];
        }

        rows = cols = 0;
        for (r = 0; r < n; r++) {
            if (rows == s1) {
                rows=cols=0;
                for (c = 0; c < n; c++) {
                    cols += M[r][c];
                    rows += M[c][r];
                }
                if (cols != rows) {
                    System.out.println("Not a magic square");
                    System.exit(0);
                } 
            }
        }

        if((rows==ls) && (ls == rs) && (rs==s1))
        System.out.println("Magic Square");

    }
}