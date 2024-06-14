import java.util.InputMismatchException;
import java.util.Scanner;

public class Asterisks {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a value between 1 and 5: ");
            int value = scanner.nextInt();

            if (value < 1 || value > 5) {
                throw new InputMismatchException("Value must be between 1 and 5.");
            }

            // Print the square of asterisks
            for (int i = 0; i < value; i++) {
                for (int j = 0; j < value; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } 
        finally{
            scanner.close();
        }
    }
}
