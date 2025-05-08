package MatrixProb;

import java.util.Scanner;

public class SortMatDecend {
    private int row, col;
    private int[][] matrix;

    // Constructor to initialize the matrix
    public SortMatDecend(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
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

    // Method to display the matrix
    public void display(String message) {
        System.out.println(message);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to sort the matrix in descending order
    public void sortDesc() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++) {
                    for (int l = 0; l < col; l++) {
                        if (matrix[i][j] > matrix[k][l]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROW OF MATRIX");
        int row = sc.nextInt();
        System.out.println("ENTER THE COLUMN OF MATRIX");
        int col = sc.nextInt();

        SortMatDecend matrix = new SortMatDecend(row, col);
        matrix.input();
        matrix.display("UNSORTED MATRIX:");
        matrix.sortDesc();
        matrix.display("SORTED MATRIX:");
    }
}
