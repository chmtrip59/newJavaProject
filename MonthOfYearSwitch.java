import java.util.Scanner;

public class MonthOfYearSwitch {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to Month Mapping\n");
        
        System.out.print("Please enter your Month number: ");
        
        int num = in.nextInt();

        String MonthName = getMonthName(num);

        System.out.println("Your Month name is: "+ MonthName );

    }

    public static String getMonthName(int num){

        String monthName = switch(num){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invalid Number";
        };

        return monthName;
    }

}
