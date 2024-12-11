package Execise9;

public class MeetingRoom extends Room{
    private int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public MeetingRoom() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" ,Capacity: "+capacity);
    }
    @Override
    public double calculateCost(){
        if(capacity>50){
            return getBaseCost()+getBaseCost()*0.2;
        }
        return getBaseCost();
    }
}
