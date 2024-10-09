public class StringFormat {
    public static void main(String[] args) {

        // String name ="chandraMauli";

        // int marks = 454516145;

        // System.out.println("Hello "+ name +", your makrs are: "+ marks);

        //Effieicient way of doing this which requires less memory as compared to above method
        // System.out.printf("Hello %s , your marks are: %d",name,marks);
        // System.out.printf("Hello %S , your marks are: %d",name,marks);
        // System.out.printf("Hello %25s , your marks are: %d",name,marks);
        // System.out.printf("Hello %25S , your marks are: %d",name,marks);
        // System.out.printf("Hello %s , your marks are: %,d",name,marks);
        // System.out.printf("Hello %-25s , your marks are: %+d",name,marks);
        // System.out.printf("Hello %-25s , your marks are: %015d",name,marks);
        // System.out.printf("Hello %-25s , your marks are: %0,15d",name,marks);
        // System.out.printf("Hello %-25s , your marks are: %15d",name,marks);


        //String Buffer Vs String Builder

        //String Builder

        StringBuilder sentence = new StringBuilder("This is a sentence.");
        sentence.append(45);
        sentence.append(", now this is my new add ");
        sentence.append(75.45);
        sentence.toString();

        System.out.println(sentence);
        
    }
}
