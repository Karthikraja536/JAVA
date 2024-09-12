class vehicle {
    private String make;
    private String model;

    public vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class Cars extends vehicle{
    private int NumberOfDoors;

    public Cars(String make, String model , int NumberOfDoors){
        super(make, model);
        this.NumberOfDoors = NumberOfDoors;
    }

    public int getNumberOfDoors(){
        return NumberOfDoors;
    }

    public void display(){
        System.out.println("Car Make:" + getMake());
        System.out.println("Car model:" + getModel());
        System.out.println("NO OF Doors:" + getNumberOfDoors());
    }
}

class Bike extends vehicle {
    private String type;

    public Bike(String make, String model, String type){
        super(make, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void display(){
        System.out.println();
        System.out.println("Bike Make:" + getMake());
        System.out.println("Bike Model:" + getModel());
        System.out.println("Bike Type:" + getType());
    }

}
public class VehicleSpecification{
    public static void main(String[] args) {
        Cars car = new Cars("Ford", "Mustang", 2);
        Bike bike = new Bike("Yamaha", "R15VM", "Sports");
        car.display();
        bike.display();
    }
}

