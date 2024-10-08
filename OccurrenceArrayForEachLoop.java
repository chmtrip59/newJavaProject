
import java.util.Scanner;

public class OccurrenceArrayForEachLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to finding occurrences\n");

        int[] nums = ArrayUtility.inputArray();

        System.out.print("Now , enter the number you want to find the occurence of:- ");

        int element = in.nextInt();

        int occ = countOccurrences(nums, element);

        System.out.println("Your element was found: "+ occ + " times." );


    }

    public static int countOccurrences(int[] nums, int element){


        int occ = 0;

        for(int num : nums){
            if(num == element){
                occ++;
            }
        }


        return occ;
    }
}
