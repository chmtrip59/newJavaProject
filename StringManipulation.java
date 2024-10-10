public class StringManipulation {
    public static void main(String[] args) {
        
        String firstName = "Chandra mauli";
        String lastName = "Tripathi";

        //Method 1 for concat
        String fullName1= firstName+ " "+lastName;

        //Method 2 for concat
        String fullName2= firstName.concat(" " +lastName);
        //Method 3 for concat
        String fullName3= firstName.concat(" ").concat(lastName);

        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(fullName3);

        //toUpperCase()
        System.out.println(fullName3.toUpperCase());


    }
}
