
public class toStringMethodUse {

    String name;
    int age;

    String rollNumber;

    String house;

    public toStringMethodUse(int age, String house, String name, String rollNumber) {
        this.age = age;
        this.house = house;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Details: {name: " + name + " ,age: " + age + " ,roll number: " + rollNumber + " ,house: "
                + house + " }";

    }

    public static void main(String[] args) {
        toStringMethodUse stu = new toStringMethodUse(32, "Green", "Golu", "124");

        // System.out.println(stu);
        // OR
        System.out.println(stu.toString());
    }

}
