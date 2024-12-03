package Execise13;

public class Truck extends Vehicle {

    private double loadCapacity, distance;

    public Truck(double loadCapacity, double distance, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public Truck() {
        super();
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" ,LoadCapacity: " + loadCapacity + " ,Distance: " + distance);
    }

    @Override
    public double calculateRentalCost() {
        double localFactor = 5;
        return getRentalPricePerDay() + (getDistance() * localFactor);
    }

}
