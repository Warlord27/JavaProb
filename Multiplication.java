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