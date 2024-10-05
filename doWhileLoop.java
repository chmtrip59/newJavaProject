
import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // System.out.print("Please enter your age:");

        // int age = in.nextInt();

        // while(age < 0 || age > 100){
        // System.out.println("Please enter your age");
        // age = in.nextInt();
        // }
        // System.out.println("Your age is: "+age);
        int age;
        do {
            System.out.print("Please enter your age:");
            age = in.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is:" + age);
    }
}
