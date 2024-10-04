import java.util.Scanner;

public class HighModerateLowUsingTernary {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to Student score finder\n");
        
        System.out.print("Please enter the your marks: ");
        
        int marks = in.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low") ;

        System.out.println("Your category is : "+category);



    }
}
