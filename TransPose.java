package MatrixProb;

import java.util.Scanner;

public class TransPose {
    private int row, col;
    private int[][] matrix, transpose;

    // Constructor to initialize the matrix
    public TransPose(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
        this.transpose = new int[col][row]; // Transpose matrix dimensions are swapped
    }

    // Method to input matrix elements
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to calculate the transpose of the matrix
    public void calcTranspose() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }

    // Method to display a matrix
    public void display(int[][] mat, int r, int c, String message) {
        System.out.println(message);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROW OF MATRIX");
        int row = sc.nextInt();
        System.out.println("ENTER THE COLUMN OF MATRIX");
        int col = sc.nextInt();

        TransPose tp = new TransPose(row, col);
        tp.input();
        tp.display(tp.matrix, row, col, "ORIGINAL MATRIX:");
        tp.calcTranspose();
        tp.display(tp.transpose, col, row, "TRANSPOSE OF MATRIX:");
    }
}
