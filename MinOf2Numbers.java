
import java.util.Scanner;

public class MinOf2Numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to minimun of two numbers:\n");

        System.out.print("Please enter the first numnber: ");
        int num1 = in.nextInt();
        System.out.print("Please enter the second numnber: ");
        int num2 = in.nextInt();
       // Because we can not call non static method in static method so that we have created a object to call the method 
        MinOf2Numbers ternary = new MinOf2Numbers();
        // here we have called the method using object refernce dot method name 
        int min = ternary.min(num1 , num2);

        System.out.println(min+ " is the minimum number");

    }
    public int min(int num1 , int num2){
        int min = num1 < num2 ? num1 : num2 ;

        return min;
    }
}
