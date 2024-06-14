import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year =scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // To find it is divisible by 4 and it is not century year and it is divisible by 400
            System.out.println(year+" is a leap year and it has 366 days");
        } else {
            System.out.println(year+" is not a leap year and it has 365 days");
        }

    }
}
