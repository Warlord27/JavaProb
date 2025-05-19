import java.util.*;

class sortTheConNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na[] = new String[5], con[] = new String[5];
        int r;
        for (r = 0; r < 5; r++) {
            System.out.println("Enter the name: ");
            na[r] = sc.nextLine();
            System.out.println("Enter the name of country: ");
            con[r] = sc.nextLine();
        }
        for (r = 0; r < 5 - 1; r++) {
            for (int j = 0; j < 5 - 1 - r; j++) {
                if (na[j].compareToIgnoreCase(na[j + 1]) > 0) {
                    // nam2 is use to carry the name
                    String nam2 = na[j + 1];
                    na[j + 1] = na[j];
                    na[j] = nam2;
                    String con2 = con[j];
                    con[j] = con[j + 1];
                    con[j + 1] = con2;
                }
            }
        }
        System.out.println();
        while (true) {
            System.out.println("Search: ");
            String sea = sc.nextLine();
            System.out.println();
            for (r = 0; r < 5; r++) {
                if (na[r].equalsIgnoreCase(sea)) {
                    System.out.println("Result ");
                    System.out.println(na[r] + "      " + con[r]);
                    break;
                }
                if (r == 4){
                  System.out.println("Not available");
                  break;
                }
            }
        }

    }
}