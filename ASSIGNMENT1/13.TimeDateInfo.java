import java.util.Calendar;
import java.util.Scanner;

public class TimeDateInfo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Get the current date and time
        long milliSeconds = System.currentTimeMillis(); // Get the current time in milliseconds

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the code from 0 to 3: "); //Get the code
            int code = scanner.nextInt();

            switch (code) {
                case 0: System.out.println("Number of Milliseconds from 1970 Jan 1: " + milliSeconds);//Print the milliseconds
                    break;
                case 1: System.out.println("Number of Seconds from 1970 Jan 1: " + (milliSeconds / 1000)); //Print the seconds
                    break;
                case 2: System.out.println("Number of Days from 1970 Jan 1: "+ (milliSeconds/(1000*60*60*24))); //Print the days
                    break;
                case 3: System.out.println("Current Date and Time: "+ calendar.getTime());//Print the date and time
                    break;
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input");//Print the exception
        }
        
    }
    
}
