import java.util.Scanner;

public class sortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        if (n > 10 || n < 2) {
            System.out.println("Invalid length, length should in the range of 2 - 10");
            main(args);
        }
        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the number: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // After sorting
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println("\nPattern");
        int num2[][] = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            int j, u = 0;
            for (j = 0; j <= i; j++) {
                num2[n - i - 1][j] = num[j];
            }
            for (int k = j; k <= n - 1; k++) {
                num2[n - i - 1][k] = num[u++];
            }
        }

        // Display

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                System.out.print(num2[i][j] + "\t");
            }
            System.out.println();
        }
        sc = null;
    }
}
