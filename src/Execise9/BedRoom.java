package Execise9;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom() {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" ,Number of bed: " + numberOfBeds);
    }

    @Override
    public double calculateCost() {
        if (numberOfBeds >= 3) {
            return getBaseCost() + getBaseCost() * 0.1;
        }
        return getBaseCost();
    }
}
