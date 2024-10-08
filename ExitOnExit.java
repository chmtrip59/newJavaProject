
import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Exit on Exit\n");

        while (true) { 
            
            System.out.print("Enter your command: ");
            String myLine = in.next();
            if(myLine.equals("exit")){
                break;
            }
        }
        System.out.println("You have entered the command successfully.");
    }

}

