import java.util.Scanner;

public class CalcUsingSwitch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to Absolute value\n");
        
        System.out.print("Please enter the 1st number: ");
        
        int num1 = in.nextInt();

        System.out.print("Please enter the 2nd number: ");

        int num2 = in.nextInt();

        System.out.print("Enter the opeartion i.e + , - , * , / :");

        String operation = in.next();
        
        int result = Calc(num1, num2, operation);

        System.out.println("Your result is: " + result);


    }

    public static int Calc(int num1 , int num2 , String operation){
        int result = switch(operation){
            case "+" -> num1 + num2 ;
            case "-" -> num1 - num2 ;
            case "*" -> num1 * num2 ;
            case "/" -> num1 / num2 ;
            default -> -1;
        };
        return result;
    }

}
