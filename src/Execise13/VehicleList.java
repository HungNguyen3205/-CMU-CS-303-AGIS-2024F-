package Execise13;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleList {

    ArrayList<Vehicle> vehiclelist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Thêm xe hơi
    public void addCar() {
        Car car = new Car();
        System.out.print("Enter vehicle ID: ");
        car.setId(sc.nextLine());
        System.out.print("Enter brand: ");
        car.setBrand(sc.nextLine());
        System.out.print("Enter model: ");
        car.setModel(sc.nextLine());
        System.out.println("Enter retal day: ");
        car.setRentalDays(sc.nextInt());
        System.out.print("Enter rental price per day: ");
        car.setRentalPricePerDay(sc.nextDouble());
        System.out.print("Enter number of seats: ");
        car.setNumberOfSeats(sc.nextInt());
        sc.nextLine(); // Consume newline
        System.out.print("Enter fuel type (petrol/diesel/electric): ");
        car.setFuelType(sc.nextLine());
        vehiclelist.add(car);
//        addVehicle(car);
    }

    // Thêm xe tải
    public void addTruck() {
        Truck truck = new Truck();
        System.out.print("Enter vehicle ID: ");
        truck.setId(sc.nextLine());
        System.out.print("Enter brand: ");
        truck.setBrand(sc.nextLine());
        System.out.print("Enter model: ");
        truck.setModel(sc.nextLine());
        System.out.println("Enter rental day: ");
        truck.setRentalDays(sc.nextInt());
        System.out.print("Enter rental price per day: ");
        truck.setRentalPricePerDay(sc.nextDouble());
        System.out.print("Enter load capacity (tons): ");
        truck.setLoadCapacity(sc.nextDouble());
        System.out.print("Enter distance traveled (km): ");
        truck.setDistance(sc.nextDouble());
        sc.nextLine(); // Consume newline
        vehiclelist.add(truck);
//        addVehicle(truck);
    }

    // Hiển thị danh sách phương tiện
    public void displayVehicle() {
        if (vehiclelist.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("List of Vehicles:");
        for (Vehicle v : vehiclelist) {
            v.displayDetails();
            System.out.println("--------------------");
        }
    }

    // Cập nhật phương tiện
    public void updateVehicle() {
        System.out.print("Enter vehicle ID: ");
        String id = sc.nextLine();
        Vehicle vehicle = findVehicleByID(id);
        if (vehicle != null) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Choose the attribute you want to update:");
                System.out.println("1. Update brand");
                System.out.println("2. Update model");
                System.out.println("3. Update rental days");
                System.out.println("4. Update rental price per day");
                if (vehicle instanceof Car) {
                    System.out.println("5. Update number of seats");
                    System.out.println("6. Update fuel type");
                } else if (vehicle instanceof Truck) {
                    System.out.println("5. Update load capacity");
                    System.out.println("6. Update distance traveled");
                }
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter new brand: ");
                        vehicle.setBrand(sc.nextLine());
                        System.out.println("Brand updated successfully.");
                        break;
                    case 2:
                        System.out.print("Enter new model: ");
                        vehicle.setModel(sc.nextLine());
                        System.out.println("Model updated successfully.");
                        break;
                    case 3:
                        System.out.print("Enter new rental days: ");
                        vehicle.setRentalDays(sc.nextInt());
                        sc.nextLine(); // Consume newline
                        System.out.println("Rental days updated successfully.");
                        break;
                    case 4:
                        System.out.print("Enter new rental price per day: ");
                        vehicle.setRentalPricePerDay(sc.nextDouble());
                        sc.nextLine(); // Consume newline
                        System.out.println("Rental price updated successfully.");
                        break;
                    case 5:
                        if (vehicle instanceof Car) {
                            Car car = (Car) vehicle;
                            System.out.print("Enter new number of seats: ");
                            car.setNumberOfSeats(sc.nextInt());
                            sc.nextLine(); // Consume newline
                            System.out.println("Number of seats updated successfully.");
                        } else if (vehicle instanceof Truck) {
                            Truck truck = (Truck) vehicle;
                            System.out.print("Enter new load capacity: ");
                            truck.setLoadCapacity(sc.nextDouble());
                            sc.nextLine(); // Consume newline
                            System.out.println("Load capacity updated successfully.");
                        }
                        break;
                    case 6:
                        if (vehicle instanceof Car) {
                            Car car = (Car) vehicle;
                            System.out.print("Enter new fuel type: ");
                            car.setFuelType(sc.nextLine());
                            System.out.println("Fuel type updated successfully.");
                        } else if (vehicle instanceof Truck) {
                            Truck truck = (Truck) vehicle;
                            System.out.print("Enter new distance traveled: ");
                            truck.setDistance(sc.nextDouble());
                            sc.nextLine(); // Consume newline
                            System.out.println("Distance traveled updated successfully.");
                        }
                        break;
                    case 0:
                        System.out.println("Exiting update process.");
                        return; // Exit the method
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Vehicle with ID " + id + " not found.");
        }
    }

    // Xóa phương tiện
    public void deleteVehicle() {
        System.out.print("Enter vehicle ID: ");
        String id = sc.nextLine();
        boolean isDeleted = deleteVehicleById(id);
        if (isDeleted) {
            System.out.println("Vehicle deleted successfully.");
        } else {
            System.out.println("Vehicle with ID " + id + " not found.");
        }
    }

    // Hàm hỗ trợ xóa phương tiện theo ID
    public boolean deleteVehicleById(String id) {
        for (int i = 0; i < vehiclelist.size(); i++) {
            if (vehiclelist.get(i).getId().equalsIgnoreCase(id)) {
                vehiclelist.remove(i);
                return true;
            }
        }
        return false;
    }

    // Tìm kiếm phương tiện
    public void findVehicle() {
        System.out.print("Enter vehicle ID: ");
        String id = sc.nextLine();
        Vehicle vehicle = findVehicleByID(id);
        if (vehicle != null) {
            vehicle.displayDetails();
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    // Hàm hỗ trợ tìm phương tiện theo ID
    public Vehicle findVehicleByID(String id) {
        for (Vehicle v : vehiclelist) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }

    // Tìm xe hơi theo số ghế
    public void findCarsBySeats() {
        System.out.print("Enter the number of seats: ");
        int numberOfSeats = sc.nextInt();
        ArrayList<Car> cars = findcarById(numberOfSeats);
        if (cars.isEmpty()) {
            System.out.println("No cars found with " + numberOfSeats + " seats.");
        } else {
            System.out.println("Cars with " + numberOfSeats + " seats:");
            for (Car car : cars) {
                car.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    // Hàm hỗ trợ tìm xe hơi theo số ghế
    public ArrayList<Car> findcarById(int numberOfSeats) {
        ArrayList<Car> cars = new ArrayList<>();
        for (Vehicle v : vehiclelist) {
            if (v instanceof Car) {
                Car car = (Car) v;
                if (car.getNumberOfSeats() == numberOfSeats) {
                    cars.add(car);
                }
            }
        }
        return cars;
    }

    // Tìm xe tải đi xa nhất
    public void findTruckWithLongestDistance() {
        Truck truck = findTruckById();
        if (truck != null) {
            System.out.println("Truck with the longest distance:");
            truck.displayDetails();
        }
    }

    // Hàm hỗ trợ tìm xe tải đi xa nhất
    public Truck findTruckById() {
        Truck longest = null;
        double maxDistance = 0;
        for (Vehicle v : vehiclelist) {
            if (v instanceof Truck) {
                Truck truck = (Truck) v;
                if (truck.getDistance() > maxDistance) {
                    maxDistance = truck.getDistance();
                    longest = truck;
                }
            }
        }
        return longest;
    }

    // Tìm xe hơi điện
    public void findElectricCars() {
        ArrayList<Car> electricCars = findElectricCar();
        if (electricCars.isEmpty()) {
            System.out.println("No electric cars found.");
        } else {
            System.out.println("Electric cars:");
            for (Car car : electricCars) {
                car.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    // Hàm hỗ trợ tìm xe hơi điện
    public ArrayList<Car> findElectricCar() {
        ArrayList<Car> electricCars = new ArrayList<>();
        for (Vehicle v : vehiclelist) {
            if (v instanceof Car) {
                Car car = (Car) v;
                if ("electric".equalsIgnoreCase(car.getFuelType())) {
                    electricCars.add(car);
                }
            }
        }
        return electricCars;
    }
}
