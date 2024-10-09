public class myCar {

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public myCar(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    

    // @Override
    // public String toString() {
    //     return "My Car name is: "+name;
    // }


    


    public static void main(String[] args) {
        myCar swift = new myCar(4, 4, 150, "Swift", "SW784", "Suzuki");

        //Output will be same because jvm automaticaaly calls toString method
        // System.out.println(swift.toString());
        System.out.println(swift);
    }


    @Override
    public String toString() {
        return "myCar [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
    }
}
