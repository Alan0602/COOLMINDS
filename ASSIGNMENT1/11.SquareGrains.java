import java.math.BigInteger;

public class SquareGrains {
    public static void main(String[] args) {

        //BigInteger use because the value will beyond the int and long size limits

        BigInteger grains = BigInteger.ONE; //Initialize grains to big integer 1
        BigInteger total = BigInteger.ZERO; //Initialize total to big integer 0
        for (int i = 1; i <= 64; i++) {
            System.out.println("Square " + i + " : " + grains + " grains"); // Print Square and grains
            
            total = total.add(grains); // Add grains to total

            grains = grains.multiply(BigInteger.valueOf(2)); // Multiply grains by 2

        }
        System.out.println("Total grains: " + total); // Print total
    }
}
