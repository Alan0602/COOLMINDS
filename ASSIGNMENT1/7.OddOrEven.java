public class OddOrEven {
    public static void main(String[] args) {
        if(args.length !=1){
            System.out.println("Please give a number in command line"); // If didnt give number from command line
            return;
        }

        try {  // If the given number is not integer 
            int number = Integer.parseInt(args[0]);

            if (number % 2 == 0) { // If the given number is even
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        } catch (NumberFormatException e) { // If the given number is not integer printing exception
            System.out.println("Invalid input. Please enter a valid integer in command line.");
        }
    }
}
