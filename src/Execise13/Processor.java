
import Execise13.VehicleList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Vehicle Management System ===");
            System.out.println("1. Add a new car");
            System.out.println("2. Add a new truck");
            System.out.println("3. Update vehicle by ID");
            System.out.println("4. Delete vehicle by ID");
            System.out.println("5. Find vehicle by ID");
            System.out.println("6. Display all vehicles");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> vehicleList.addCar();
                case 2 -> vehicleList.addTruck();
                case 3 -> vehicleList.updateVehicle();
                case 4 -> vehicleList.deleteVehicle();
                case 5 -> vehicleList.findVehicle();
                case 6 -> vehicleList.displayVehicle();
                case 0 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
