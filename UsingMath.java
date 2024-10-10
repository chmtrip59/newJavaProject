
import java.util.Scanner;

public class UsingMath {

    double radiusMM;

    UsingMath(double radiusMM){
        this.radiusMM =radiusMM;
    }

    double getCircumference(){

        return 2 * radiusMM * Math.PI;

    }
    double getArea(){

        return Math.PI * Math.pow(radiusMM, 2);

    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: "+radiusMM+", Circumference in mm: "+ getCircumference() +" , Area in mm2: " + getArea() + " ";
    }

    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the world of circle\n");

        System.out.print("Please enter your radius: ");
        double radius = in.nextDouble();

        UsingMath circle = new UsingMath(radius);

        System.out.println(circle);
    }
}
