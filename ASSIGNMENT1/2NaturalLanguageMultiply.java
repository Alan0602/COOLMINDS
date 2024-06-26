import java.util.HashMap;
import java.util.Scanner;

public class NaturalLanguage {

    private static final HashMap<String, Integer> stringToInt = new HashMap<>();

    static {
        // Directly mapping all necessary values to the HashMap
        stringToInt.put("zero", 0);
        stringToInt.put("one", 1);
        stringToInt.put("two", 2);
        stringToInt.put("three", 3);
        stringToInt.put("four", 4);
        stringToInt.put("five", 5);
        stringToInt.put("six", 6);
        stringToInt.put("seven", 7);
        stringToInt.put("eight", 8);
        stringToInt.put("nine", 9);
        stringToInt.put("ten", 10);
        stringToInt.put("eleven", 11);
        stringToInt.put("twelve", 12);
        stringToInt.put("thirteen", 13);
        stringToInt.put("fourteen", 14);
        stringToInt.put("fifteen", 15);
        stringToInt.put("sixteen", 16);
        stringToInt.put("seventeen", 17);
        stringToInt.put("eighteen", 18);
        stringToInt.put("nineteen", 19);
        stringToInt.put("twenty", 20);
        stringToInt.put("thirty", 30);
        stringToInt.put("forty", 40);
        stringToInt.put("fifty", 50);
        stringToInt.put("sixty", 60);
        stringToInt.put("seventy", 70);
        stringToInt.put("eighty", 80);
        stringToInt.put("ninety", 90);
    }

    // Convert string to integer based on the stringToInt
    private static int toInt(String s) throws Exception {
        s = s.toLowerCase();
        String[] parts = s.split(" ");
        int total = 0;

        for (String part : parts) {
            Integer num = stringToInt.get(part);
            if (num != null) {
                total += num;
            } else {
                throw new Exception("Text is in an invalid format: " + s);
            }
        }

        return total;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number in words: ");
        String number1 = scanner.nextLine();

        System.out.print("Enter the second number in words: ");
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
