
import java.util.HashMap;
import java.util.Scanner;

public class NaturalLanguageMultiply {

    private static final HashMap<String, Integer> stringToInt = new HashMap<>();

   
    static {
        String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        //Mpping ones to its number
        for (int i = 0; i < ones.length; i++) {
            stringToInt.put(ones[i], i);
        }

        //Mapping teens to its number
        for (int i = 0; i < teens.length; i++) {
            stringToInt.put(teens[i], 10 + i);
        }

        //Mapping tens to its number
        for (int i = 0; i < tens.length; i++) {
            stringToInt.put(tens[i], 20 + (10 * i));
        }

        //Mapping tens and ones to its number
        for (int i = 0; i < tens.length; i++) {
            for (int j = 1; j < ones.length; j++) {
                stringToInt.put(tens[i] + " " + ones[j], 20 + (10 * i) + j);
            }
        }
    }

    // Convert string to integer based on the stringToInt
    private static int toInt(String s) throws Exception {
        if (stringToInt.containsKey(s.toLowerCase())) {
            return stringToInt.get(s.toLowerCase());
        } else {
            throw new Exception("Text is in invalid format" );
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (in words): ");
        String number1 = scanner.nextLine();

        System.out.print("Enter the second number (in words): ");
        String number2 = scanner.nextLine();

        try {
            int num1 = toInt(number1);
            int num2 = toInt(number2);
            int result = num1 * num2;
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
