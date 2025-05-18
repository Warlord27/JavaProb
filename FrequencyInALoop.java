import java.util.Scanner;

public class FrequencyInALoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a sentence: ");
    //     String st = sc.nextLine().toUpperCase();
    //     int asc[]= new int[97];
    //     for (int i = 0; i < st.length(); i++) {
    //         asc[(int)st.charAt(i)]++;
    //     }
    //  for (int i = 0; i < asc.length; i++) {
    //     if(asc[i]!=0)
    //     System.out.println((char)i+" "+asc[i]);
    //  }
      // int n = sc.nextInt(),s=3,r=3;
      // for(s<=n;s+=r,r++){
      //   System.out.println(s);
      // }

      // for (int i = 100; i < 121; i++) {
      //   int z=0;
      //   if(i%10!=0){
      //     String s = ""+i;
      //     for (int j = 0; j < s.length()-1; j++) {
      //       for (int j2 = j+1; j2 < s.length(); j2++) {
      //         if(s.charAt(j)==s.charAt(j2))
      //         z=1;
      //       }
      //     }
      //     if(z!=1)
      //     System.out.println(i +",");
      //   }
      // }
      
int m= 100;
int n= 11,s=0,rev=m;
while (n!=s) {
  rev=m;
  m++;
  s=0;
  while (rev!=0) {
    s+=rev%10;
    rev/=10;
  }
}
System.out.println(m);
    }
}
