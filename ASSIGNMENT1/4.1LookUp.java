import java.util.HashMap;
import java.util.Scanner;

public class LookUp {

    private static final HashMap<Integer, Thing> shop = new HashMap<>();

    static{
        shop.put(1,new Video(1, "The Boys", "Robert Risto"));
        shop.put(2,new Video(2, "The Flash", "Gus Grissom"));
        shop.put(3,new Books(3, "The Batman", "Matt Reeves"));
        shop.put(4,new Books(4, "The River", "Henry Cavill"));
        shop.put(5,new Audio(5, "The pops", "Rush Harry"));
        shop.put(6,new Audio(6, "The Carpenter", "Jim Convig"));
    
    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the serial number from 1 to 6: ");
        int serialNumber = scanner.nextInt();

        Thing item = shop.get(serialNumber);

        if (item != null) {
            System.out.println(item.getDescription());
        } else {
            System.out.println("Invalid serial number");
        }

    }

        
}
