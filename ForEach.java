public class ForEach {
    public static void main(String[] args) {
        String[] arr = new String[]{
            "Ram" ,"Shyam","Mohan","Sohan","Sita","Geeta"
        };
        // printArray(arr);
        printForEach(arr);
    }
    //For Loop
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    //ForEach Loop
    public static void printForEach(String[] arr){
        for(String myArr : arr){
            System.out.println(myArr);
        }
    }
}
