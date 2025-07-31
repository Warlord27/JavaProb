import java.util.*;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element in array: ");
        int num[]= new int[5];
        for (int i =0;i<num.length;i++) {
            num[i]= sc.nextInt();
        }
                System.out.println("\nOriginal array: " + Arrays.toString(num));
                Arrays.sort(num);
        int Gn=num[0],Sn=num[num.length-1],sum=0;
        for (int i = 0; i < num.length; i++) {
            sum=0;
            for (int j = 0; j < num.length; j++) {
               if(j!=i)
               sum+=num[j]; 

            }
            System.out.println("Sum="+sum);
            Gn= Math.max(Gn,sum);
        }
        for (int i = 0; i < num.length; i++) {
            sum=0;
            for (int j = 0; j < num.length; j++) {
               if(j!=i)
               sum+=num[j]; 

            }
            System.out.println("Sum="+sum);
            Sn= Math.min(Gn,sum);
        }

        System.out.println("Greatest Number"+Gn+"\nSmallest Number: "+Sn);
    }
}
