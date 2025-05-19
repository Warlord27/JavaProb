import java.util.*;

public class RandomLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int art[] = new int[5], r = 0, max = 1, rndom = 0;
        while (r < 5) {
            System.out.print("Enter a single digit number: ");
            art[r++] = sc.nextInt();
        }

        r = 0;
        while (r < 25) {
            rndom = 0;
            for (int i = 0; i < 5; i++) {
                int no = (int) Math.floor(Math.random() * 5);
                rndom = rndom * 10 + art[no];
                if (rndom > max)
                    max = rndom;
            }
        }
        System.out.println("Biggest number:: " + max);

    }
}
