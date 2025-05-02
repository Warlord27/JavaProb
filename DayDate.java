import java.util.HashMap;
import java.util.Scanner;

public class DayDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int y = sc.nextInt();
        System.out.println("Enter the month: ");
        String mon = sc.next().toUpperCase();
        System.out.println("Enter  the day: ");
        int dat = sc.nextInt();
        String fyear = "" + (y - y % 100);
        fyear = fyear.substring(0, 2);

        HashMap<String, Integer> mc = new HashMap<>();
        mc.put("JANUARY", 1);
        mc.put("FEBRUARY", 4);
        mc.put("MARCH", 4);
        mc.put("APRIL", 0);
        mc.put("MAY", 2);
        mc.put("JUNE", 5);
        mc.put("JULY", 0);
        mc.put("AUGUST", 3);
        mc.put("SEPTEMBER", 6);
        mc.put("OCTOBER", 1);
        mc.put("NOVEMBER", 4);
        mc.put("DECEMBER", 6);

        HashMap<String, Integer> ct = new HashMap<>();
        ct.put("17", 4);
        ct.put("18", 2);
        ct.put("19", 0);
        ct.put("20", 6);
        ct.put("21", 4);
        ct.put("22", 2);
        ct.put("23", 0);

        HashMap<Integer, String> day = new HashMap<>();
        day.put(0, "SUNDAY");
        day.put(1, "MONDAY");
        day.put(2, "TUESDAY");
        day.put(3, "WEDNESDAY");
        day.put(4, "THURSDAY");
        day.put(5, "FRIDAY");
        day.put(6, "SATURDAY");

        int digi = Integer.valueOf(y) % 100;
        digi /= 4;
        digi += dat;
        int monCode = mc.getOrDefault(mon, -1);
        int centuryCode = ct.getOrDefault(fyear, -1);
        digi = (digi + monCode - 1 + centuryCode + y % 100) % 7;

        if (day.containsKey(digi)) {
            System.out.println("Day: " + day.get(digi));
        } else {
            System.out.println("Invalid day calculation.");
        }
        sc.close();
    }
}
