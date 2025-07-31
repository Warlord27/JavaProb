import java.util.Scanner;

public class BirthdayCandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of candle: ");
        int cn = sc.nextInt(), can[] = new int[cn];
        int con=0,hig=0;
        for (int i = 0; i < can.length; i++) {
             System.out.println("Enter the size of candle: ");
            can[i]=sc.nextInt();
            hig=Math.max(hig,can[i] );
        }
        for (int i = 0; i < can.length; i++) {
            if (hig==can[i]) {
                con++;
            }
        }
        System.out.println("Candle Size: "+hig);
        System.out.println("No of candles: "+con);
    }
}
