public class ArraytoStringUsingStringBuilder {
    public static void main(String[] args) {
        String[] arr = {"This", "is", "the", "best", "and", "most", "detailed", "course", "on", "java", "on", "the", "internet."};

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str +" ");
        }
        System.out.println(sb);
    }
}
