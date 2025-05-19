import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt(),mat[][]= new int[n][n],r,c,rs=0,ls=0,s1=0;
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                System.out.println("Enter a number:");
                mat[r][c]=sc.nextInt();
        
            }
        }
    }
}
