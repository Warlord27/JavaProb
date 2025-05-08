package MatrixProb;

import java.util.Scanner;

public class NoBoundElements {
    private int row, col;
    private int[][] matrix;

    // Constructor to initialize the matrix
    public NoBoundElements(int row, int col) {
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
    public void display() {
        System.out.println("MATRIX:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to display non-boundary elements
    public void displayNonBoundary() {
        System.out.println("NON-BOUNDARY ELEMENTS OF MATRIX:");
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS OF MATRIX");
        int row = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS OF MATRIX");
        int col = sc.nextInt();

        NoBoundElements matrix = new NoBoundElements(row, col);
        matrix.input();
        matrix.display();
        matrix.displayNonBoundary();
    }
}
