import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    int mileage;

    LightMotorVehicle(String company, double price, int mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacityInTons;

    HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    void display() {
        super.display();
        System.out.println("Capacity in Tons: " + capacityInTons);
    }
}

public class VehicleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
        	System.out.println("1:Heavy Motor Vehicle:");
        	System.out.println("2:Light Motor Vehicle:");
        	System.out.println("3:Exit");
        	System.out.println("enter your choice");
            int choice = scanner.nextInt();

            System.out.print("Enter company: ");
            String company = scanner.next();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            if (choice == 1) {
                System.out.print("Enter mileage: ");
                int mileage = scanner.nextInt();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (choice == 2) {
                System.out.print("Enter capacity in tons: ");
                double capacityInTons = scanner.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacityInTons);
            }
        }

        System.out.println("Vehicle Information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println();
        }
    }
}