
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Factorial Generator\n");

        System.out.print("Please enter your number: ");

        int num = sc.nextInt();

        // long fact = factorial(num);
           long fact = recursion(num);

        System.out.println("Factorial of your number is :"+fact);


    }
    //With recursion
    public static long recursion(int num){
        System.out.println("Function called for: "+num);
        if(num == 1){
            return 1;
        }
        return num * recursion(num - 1);
    }
    // Without recursion 
    public static long factorial(int num){
        
        int fact = 1;

        for(int i = 1; i <= num ; i++){

            fact = fact * i;

            
        }
        
        
        return fact;
    }
    
}
