import java.util.Scanner;

public class Rotaion90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row and column: ");
        int row=sc.nextInt(),col=sc.nextInt(), num[][]= new int[row][col],unum[][]= new int[row][col];
        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter a number: ");
                num[i][j]=sc.nextInt();
            }
        }
        // Display
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Input Giver");
        // rotating
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                unum[row-j-1][i]=num[i][j];
            }
        }
        
        // Display
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(unum[i][j]+"\t");
            }
            System.out.println();
        }
      

    }
}
