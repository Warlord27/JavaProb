import java.util.*;

public class Matrix_MARK_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 1 2 3
         * 6 7 8
         * 4 6 8
         */
        int mat[][] = new int[5][5], r, c, temp;
        // Input👉👇👇👇
        for (r = 0; r < 5; r++) {
            for (c = 0; c < 5; c++) {
                System.out.println("Enter a Number: ");
                mat[r][c] = sc.nextInt();
            }
        }
        // Sorting
        for (r = 0; r < 4; r++) {
            if (mat[r][r] < mat[r + 1][r + 1]) {
                temp = mat[r][r];
                mat[r][r] = mat[r + 1][r + 1];
                mat[r + 1][r + 1] = temp;
            }
        }

        // Result🧿🧿🔮🔮
        for(r=0;r<5;r++){
            for(c=0;c<5;c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.println();
        }

    }
}
