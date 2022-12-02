public class House {
    //VARIABLES
    private String address;
    private int numberOfFloors;

    //CONSTRUCTOR METHOD
    public House(String address, int numberOfFloors){
        System.out.println("A new house was created");
        this.address=address;
        this.numberOfFloors=numberOfFloors;
        System.out.println("The address is "+address+" and the number of floor are "+numberOfFloors);
    }
}
