import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students, no of studentsshould be greater than 3 and less than 11: ");
        int n = sc.nextInt();
        if(n<3 || n>11){
        System.out.println("Invalid");
        sc.close();
        main(args);
        }
        char qut[][]=new char[n][5]; int r,c,con=0;
        String key= "DDCAB";
        for(r=0;r<n;r++){
            System.out.println("Participant No: "+(r+1));
            for(c=0;c<5;c++){
                System.out.println("Enter the answer of question no "+(c+1)+" option are ABCD: ");
                qut[r][c]=sc.next().toUpperCase().charAt(0);
            }
        } 
        int high=0,no=0;
        System.out.println("Scores: ");
        for(r=0;r<n;r++){
            con=0;
            for(c=0;c<5;c++){
                if(qut[r][c]==key.charAt(0))
                con++;
            }
            System.out.println("Participant "+(r+1)+" = "+con);
            if(high<con){
                high=con;
                no=r+1;
            }
        }
        System.out.println("Highest Score: Participant "+no);
    }
}
