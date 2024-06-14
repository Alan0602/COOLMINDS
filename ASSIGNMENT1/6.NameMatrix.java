public class NameMatrix {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please give any name in command line"); // If didnt give name from command line
            return;
        }

        String name = "";
        if (args.length > 1) { // If given name from command line has more than one word
            for (String s : args) {
                name += s.trim() ; // concatinating the name
            }
        } else {
            name = args[0]; // If not giving the name itself
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(name); //Printing the row of name

                if (j < 9) { // If not last element in row then print space
                    System.out.print("  ");
                }
            }
            System.out.println(""); // For next row
        }
    }
}
