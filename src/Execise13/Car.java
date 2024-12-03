package Execise13;

import java.util.Scanner;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public Car() {
        super();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" ,NumberOfSeats: " + numberOfSeats + " ,FuelType: " + fuelType);
    }

    @Override
    public double calculateRentalCost() {
        System.out.println("Enter fuel type: (electric|petrol|diesel) ");
        Scanner sc = new Scanner(System.in);
//        fuelType = sc.nextLine();
        setFuelType(sc.nextLine());
        if (getFuelType().equalsIgnoreCase("electric")) {
            return getRentalPricePerDay() * getRentalDays()* 0.9;
        }
        return getRentalPricePerDay() * getRentalDays();
    }

}
