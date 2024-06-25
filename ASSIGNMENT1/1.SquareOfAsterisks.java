import java.util.Scanner;
public class SquareOfAstriks{
    public static void main(String[] args) {
        System.out.print("Enter the value between 1 to 5:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if(number<=5 && number>0){                   
        for(int i=0; i<number; i++){      
            for(int j=0; j<number; j++){ 
                System.out.print("* ");
            }
            System.out.println();
        }       
    }
    else{
        System.out.println("Wrong Input , Try to write number from 1 to 5:");
    }
    }
}
