import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.println("Enter a year between 0 and inf. (enter a negative number to exit)");
            System.out.print(">> ");
            year = scanner.nextInt();

            if (year < 0) {
                break;
            }

            System.out.print(year);
            if (year < 2024) {
                System.out.print(" was");
            } else {
                System.out.print(" is");
            }

            boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? true : false; // broken

            if (isLeapYear) {
                System.out.print("");
            } else {
                System.out.print(" not");
            }
            System.out.println(" a leap year.");
        }
        scanner.close();
    }
}
