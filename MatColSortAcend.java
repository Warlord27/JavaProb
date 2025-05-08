package MatrixProb;

import java.util.Scanner;

public class MatColSortAcend {
    private int row, col;
    private int[][] arr;

    // Constructor to initialize the matrix
    public MatColSortAcend(int row, int col) {
        this.row = row;
        this.col = col;
        this.arr = new int[row][col];
    }

    // Method to input matrix elements
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display the matrix
    public void display(String message) {
        System.out.println(message);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to sort the matrix column-wise in ascending order
    public void sortCols() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++) {
                    if (arr[i][j] < arr[k][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = temp;
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

        MatColSortAcend matrix = new MatColSortAcend(row, col);
        matrix.input();
        matrix.display("UNSORTED MATRIX");
        matrix.sortCols();
        matrix.display("SORTED MATRIX");
    }
}