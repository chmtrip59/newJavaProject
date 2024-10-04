
import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to Absolute value\n");
        
        System.out.print("Please enter the number: ");
        
        int num = in.nextInt();

        int result = num >= 0 ? num : -num ;

        System.out.println("Absolute value is: "+result);
    }
}
