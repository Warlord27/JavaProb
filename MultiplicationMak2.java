package MatrixProb;

import java.util.Scanner;

public class Multiplication {
    int mat[][], r, c;

    Multiplication(int rr, int cc) {
        r = rr;
        c = cc;
        mat = new int[r][c];
    }

    void getrel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    boolean check(Multiplication a) {
        return a.c == this.r;
    }

    void show() {
        System.out.println("Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    Multiplication multiply(Multiplication a) {
        Multiplication c = new Multiplication(a.r, this.c);
        for (int i = 0; i < a.r; i++) {
            for (int j = 0; j < this.c; j++) {
                int sum = 0;
                for (int k = 0; k < a.c; k++) {
                    sum += a.mat[i][k] * this.mat[k][j];
                }
                c.mat[i][j] = sum;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row size of 1st matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter Column size of 1st matrix:");
        int c1 = sc.nextInt();
        System.out.println("Enter Row size of 2nd matrix:");
        int r2 = sc.nextInt();
        System.out.println("Enter Column size of 2nd matrix:");
        int c2 = sc.nextInt();
        Multiplication a = new Multiplication(r1, c1);
        Multiplication b = new Multiplication(r2, c2);

        if (b.check(a)) {
            Multiplication c = new Multiplication(r1, c2);
            a.getrel();
            b.getrel();
            a.show();
            b.show();
            c = b.multiply(a);
            c.show();
        } else
            System.out.println("Error in roe size!");
    }
}

This Java program defines a `Multiplication` class for performing matrix multiplication. Here’s a breakdown of its functionality:

/*- Fields:  
  - `int mat[][]`: 2D array to store matrix elements  
  - `int r, c`: number of rows and columns

- Constructor:  
  - Initializes the matrix with given rows and columns.

- Methods
  - `getrel()`: Prompts the user to enter elements for the matrix.
  - `check(Multiplication a)`: Checks if the current matrix can be multiplied with matrix `a` (i.e., columns of `a` == rows of `this`).
  - `show()`: Prints the matrix.
  - `multiply(Multiplication a)`: Multiplies the current matrix with matrix `a` and returns the result as a new `Multiplication` object.

- **Main Method:**  
  - Takes matrix sizes from the user.
  - Creates two matrices.
  - Checks if multiplication is possible.
  - If possible, takes input for both matrices, displays them, multiplies them, and displays the result.  
  - If not, prints an error message.

Note:
There is a logical issue in the multiplication and check logic. The standard rule for matrix multiplication is:  
*Number of columns of the first matrix == Number of rows of the second matrix.*  
But the code checks `b.check(a)` (i.e., `a.c == b.r`) and then multiplies `b.multiply(a)`, which is a bit confusing and may lead to incorrect results if not handled carefully.*/
