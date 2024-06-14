
public class TimesTable {

    public static void main(String[] args) {
        // printing the gap in first row
        System.out.print("  ");
        // Printing the header numbers 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // create the new line
        System.out.println();

        for (int i = 0; i < 10; i++) {
            // Printing the first number to be printed
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                // printing the multiplication table
                System.out.print(i * j + " ");
            }
            // create the new line
            System.out.println();
        }

    }
}
