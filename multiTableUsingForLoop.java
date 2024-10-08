
import java.util.Scanner;

public class multiTableUsingForLoop {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the table number: ");
        int table = in.nextInt();

        for(int i=1;i<=10;i++){

            // int myTable = table * i ;

            // System.out.println("Your table for " + table + " is: " + myTable);
            System.out.println(table + " X " + i + " = " + (table * i));

        }
    }
}
