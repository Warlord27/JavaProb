import java.util.HashMap;
import java.util.Scanner;

public class DayDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        String month = sc.next().toUpperCase();
        System.out.println("Enter the day: ");
        int dayOfMonth = sc.nextInt();

        // Month codes
        HashMap<String, Integer> monthCodes = new HashMap<>();
        monthCodes.put("JANUARY", 1);
        monthCodes.put("FEBRUARY", 4);
        monthCodes.put("MARCH", 4);
        monthCodes.put("APRIL", 0);
        monthCodes.put("MAY", 2);
        monthCodes.put("JUNE", 5);
        monthCodes.put("JULY", 0);
        monthCodes.put("AUGUST", 3);
        monthCodes.put("SEPTEMBER", 6);
        monthCodes.put("OCTOBER", 1);
        monthCodes.put("NOVEMBER", 4);
        monthCodes.put("DECEMBER", 6);

        // Day values
        HashMap<Integer, String> dayNames = new HashMap<>();
        dayNames.put(0, "SUNDAY");
        dayNames.put(1, "MONDAY");
        dayNames.put(2, "TUESDAY");
        dayNames.put(3, "WEDNESDAY");
        dayNames.put(4, "THURSDAY");
        dayNames.put(5, "FRIDAY");
        dayNames.put(6, "SATURDAY");

        // Validate month
        if (!monthCodes.containsKey(month)) {
            System.out.println("Invalid month entered.");
            sc.close();
            return;
        }

        // Leap year adjustment
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear && (month.equals("JANUARY") || month.equals("FEBRUARY"))) {
            dayOfMonth -= 1; // Subtract 1 for leap year adjustment
        }

        // Calculate the century code dynamically
        int century = year / 100;
        int centuryCode = (3 - (century % 4)) * 2;

        // Calculate the year part
        int yearPart = year % 100;
        int yearCode = yearPart + (yearPart / 4);

        // Get the month code
        int monthCode = monthCodes.get(month);

        // Final formula
        int dayCode = (yearCode + monthCode + dayOfMonth + centuryCode) % 7;

        // Print the result
        if (dayNames.containsKey(dayCode)) {
            System.out.println("Day: " + dayNames.get(dayCode));
        } else {
            System.out.println("Invalid day calculation.");
        }

        sc.close();
    }
}



/*

Changes Made:
Dynamic Century Code Calculation:

Instead of using a fixed HashMap for century codes, the program calculates the century code dynamically using (3 - (century % 4)) * 2.
Leap Year Adjustment:

A check is added to determine if the year is a leap year.
For leap years, January and February days are adjusted by subtracting 1.
Validation:

Checks if the entered month is valid. If not, the program exits with an error message.
Scalability:

The program now works for any year, including years not covered by the original fixed century codes.

*/
