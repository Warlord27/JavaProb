import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,rev,c,mat[]= new int[5];
        for(r=0;r<5;r++){
            System.out.println("Enter a number: ");
            mat[r]=sc.nextInt();
        }
        for(r=1;r<5;r++){
            rev=mat[r];
            c=r-1;
            while (c>=0 && mat[c]>rev) {
                mat[c+1]=mat[c];
                c--;
            }
            mat[c+1]=rev;
        }

        System.out.println();
        for(r=0;r<5;r++)
        System.out.println(mat[r]);
    }
}
