import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 5 , guessNumber;
        
        System.out.println("Welcome to the number guessing game");
        
        do { 
            System.out.print("Please guess the number between 1 to 9: ");
            guessNumber  = sc.nextInt();
           
        } while (num != guessNumber);

    System.out.println("You have successfully guessed the number");

    }
}
