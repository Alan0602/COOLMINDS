import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the year: ");
            int year = scan.nextInt();

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year and it has 366 days");
            } else {
                System.out.println(year + " is not a leap year and it has 365 days");
            }
            scan.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println(" Please enter a valid integer year.");
        }
    }
}
