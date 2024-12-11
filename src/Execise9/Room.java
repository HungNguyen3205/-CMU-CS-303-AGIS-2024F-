package Execise9;

public abstract class Room implements IRoom {

    private String id, name;
    private double baseCost;

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public Room() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public void displayDetails() {
        System.out.print("ID: "+id+" ,Name: "+name+" ,BaseCost: "+baseCost);
    }

    @Override
    public double calculateCost() {
        return 0;
    }
}
