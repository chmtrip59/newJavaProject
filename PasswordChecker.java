
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Password Checker/n");

        
        String password;
        
        do{
            
            System.out.print("Please enter your password: ");
            password = sc.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering valid password");
    }
 public static boolean isValidPassword(String password){

    return password.length() > 6;
 }
}

