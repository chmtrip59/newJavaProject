
import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Welcome to minimun of two numbers:\n");

        System.out.print("Please enter the numnber: ");
        int num = in.nextInt();

        EvenOddTernary myOjb = new EvenOddTernary();

        String evenOdd = myOjb.EvenOdd(num);

        System.out.println(evenOdd+ " ");



    }

    public String EvenOdd(int num){

     String result =   num % 2 == 0 ? "Even" : "Odd";
        
        return result;
    }
}
