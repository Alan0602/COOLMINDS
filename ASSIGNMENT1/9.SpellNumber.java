import java.util.Scanner;

public class SpellNumber {
    public static void main(String[] args) {

        String[] tens = {"tewnty","thirty","forty","fifty","sixty","seventy","eighty","ninety"}; // Create the array for tens
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"}; // Create array for ones

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number from 20 to 99:");
            int num = scanner.nextInt();

            if(num > 99 || num < 20) { // Checking number is the range
               System.out.print("Number is Out of Range, ");
            }

            // Splitting the ones and tens from number
            int tensPlace = num / 10;
            int onesPlace = num % 10;

            String spell = tens[tensPlace-2]; //Taking the tensPlace number

            if (onesPlace != 0){
                spell += " " + ones[onesPlace]; //Taking ones place number
            }

            System.out.println(num + " - " + spell); // Printing the spelling

            scanner.close();

        } catch (Exception e) { // Handling ArrayOutOfBoundsException
            System.out.print("Value must between 20 and 99.");
        }
    }
}
