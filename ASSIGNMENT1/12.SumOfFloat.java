public class SumOfFloat {
    public static void main(String[] args) {
        double sum = 0.0;
         // Add 0.1 to sum 1000 times
        for(int i = 0 ; i< 1000; i++){
            sum += 0.1;
        }
         // Print the sum
        System.out.println("Sum = "+sum);
        // Check if sum is equal to 100
        if(sum == 100.0)
            System.out.println("sum is 100");
        else
            System.out.println("sum is not 100");
    }
    
}
