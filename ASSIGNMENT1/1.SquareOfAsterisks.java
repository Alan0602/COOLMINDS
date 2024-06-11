import java.util.Scanner;
public class SquareOfAstriks {
    public static void main(String[] args) {
        System.out.print("Enter the value between 1 to 5:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // 1. Checking if the value is between 1 and 5
        if (x <= 5 && x > 0) {
            // 2. Loop for each row
            for (int i = 0; i < x; i++) {
                // 3. Loop for each column in a row
                for (int j = 0; j < x; j++) {
                    System.out.print("* ");  // Printing an asterisk followed by a space
                }
                System.out.println();  // 4. Moving to the next row
            }
        } else {
            System.out.println("Wrong value");
        }
    }
}
