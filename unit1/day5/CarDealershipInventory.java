import java.util.Scanner;

class car {
    String make;
    String model;
    int year;
    float price;

    public car(String make, String model, int year, float price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("Price:" + price);

    }
}
    public class CarDealershipInventory{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter car make:");
            String make = scanner.nextLine();

            System.out.print("Enter car model:");
            String model = scanner.nextLine();

            System.out.print("Enter car year:");
            int year = scanner.nextInt();

            System.out.print("Enter car price:$");
            float price = scanner.nextFloat();

            car obj = new car(make, model, year, price);
            obj.display();
        }


    }

