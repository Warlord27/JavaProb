import java.util.Scanner;

public class Matrix_muLtiplication {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of first matrix: ");
    int r1=sc.nextInt(),c1=sc.nextInt();
    System.out.println("Enter the length of second matrix: ");
    int r2=sc.nextInt(),c2=sc.nextInt();
    int a,s,d,sum=0;

    int mat[][],mato[][];

    if(c1==r2){
        mat=new int[r1][c1];
        mato=new int[r2][c2];
        
        System.out.println("Enter the number in 1st matrix");
        for(a=0;a<r1;a++){
            for(s=0;s<c1;s++){
                System.out.println("Enter:");
                mat[a][s]=sc.nextInt();
            }
        }

        System.out.println("Enter the number in 2nd matrix");
        for(a=0;a<r2;a++){
            for(s=0;s<c2;s++){
                System.out.println("Enter:");
                mato[a][s]=sc.nextInt();
            }
        }

        System.out.println("1st matrix");
        for(a=0;a<r1;a++){
            for(s=0;s<c1;s++){
                System.out.print(mat[a][s]+" ");
            }
            System.out.println();
        }

        System.out.println("2nd matrix");
        for(a=0;a<r2;a++){
            for(s=0;s<c2;s++){
                System.out.print(mat[a][s]+" ");
            }
            System.out.println();
        }
        
        //producting
        for(d=0;d<r1;d++){
                sum=0;
            for(a=0;a<c1;a++){
                for(s=0;s<r2;s++){
                sum+=(mat[a][s]*mato[s][a]);    
            }
            System.out.print(sum+" ");
            }
        System.out.println();
        }

    }
    else
    System.out.println("Invalid length");



    }
}