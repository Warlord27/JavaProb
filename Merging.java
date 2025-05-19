import java.util.*;

class Merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, n, a[] = new int[10], b[] = new int[6];
        for (r = 0; r < 10; r++) {
            System.out.print("Enter in a: ");
            a[r] = sc.nextInt();
        }

        for (r = 0; r < 6; r++) {
            System.out.print("Enter in b: ");
            b[r] = sc.nextInt();
        }

        int[] am = new int[16];
        for (r = 0; r < a.length; r++)
            am[r] = a[r];

        n = 0;
        for (r = 0; r < 6; r++)
            am[r + a.length] = b[r];

        System.out.println();
        System.out.println();
        System.out.println("After Merging");
        for (r = 0; r < 16; r++)
            System.out.println(am[r]);

    }
}