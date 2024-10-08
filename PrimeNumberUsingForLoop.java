
import java.util.Scanner;

public class PrimeNumberUsingForLoop {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Prime number finder:/n");

        System.out.print("Please enter te number: ");

        int num = scan.nextInt();

        // boolean isPrime = isPrime(num);

        //Used Ternary Operator instead of if-else
        // if(isPrime){
        //     System.out.println("Your number is a prime number");
        // }else{
        //     System.out.println("Your number is not prime number ");
        // }

        System.out.println("Your number is "+ (isPrime(num) ? "Prime number" : " not Prime number"));
    }

    public static boolean isPrime(int num){
        
        for(int i = 2 ; i<num ; i++){

            if(num % i == 0){
                
                return false;
            }
        }
        return true;
    }
}
