package Execise9;

import Execise9.BedRoom;
import Execise9.MeetingRoom;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {

    ArrayList<Room> roomlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addMeetingRoom(MeetingRoom mt) {
        System.out.print("Enter id: ");
        mt.setId(sc.nextLine());
        System.out.print("Enter name: ");
        mt.setName(sc.nextLine());
        System.out.print("Enter base cost: ");
        mt.setBaseCost(sc.nextInt());
        System.out.print("Enter capacity: ");
        mt.setCapacity(sc.nextInt());
        sc.nextLine();
        roomlist.add(mt);
    }

    public void addBedRoom(BedRoom b) {
        System.out.print("Enter id: ");
        b.setId(sc.nextLine());
        System.out.print("Enter name: ");
        b.setName(sc.nextLine());
        System.out.print("Enter base cost: ");
        b.setBaseCost(sc.nextInt());
        System.out.print("Enter numberOfBeds: ");
        b.setNumberOfBeds(sc.nextInt());
        sc.nextLine();
        roomlist.add(b);
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomlist) {
            if (r.getId().equalsIgnoreCase(id)) {
                System.out.println("Room found. Enter new details:");

                System.out.print("Enter new name: ");
                r.setName(sc.nextLine());

                System.out.print("Enter new base cost: ");
                r.setBaseCost(sc.nextInt());
                sc.nextLine();

                if (r instanceof MeetingRoom) {
                    System.out.print("Enter new capacity: ");
                    ((MeetingRoom) r).setCapacity(sc.nextInt());
                    sc.nextLine();
                } else if (r instanceof BedRoom) {
                    System.out.print("Enter new number of beds: ");
                    ((BedRoom) r).setNumberOfBeds(sc.nextInt());
                    sc.nextLine();
                }

                System.out.println("Room updated successfully!");
                return true;
            }
        }

        System.out.println("Room with ID " + id + " not found.");
        return false;
    }

    public boolean deleteRoomById(String id) {
        for (Room r : roomlist) {
            if (r.getId().equalsIgnoreCase(id)) {
                roomlist.remove(r);
            }
            return true;
        }
        return false;
    }

    public Room findRoomById(String id) {
        for (Room r : roomlist) {
            if (r.getId().equalsIgnoreCase(id)) {
                r.displayDetails();
                return r;
            }
        }
        return null;
    }

    public void displayAllRooms() {
        for (Room r : roomlist) {
            r.displayDetails();
        }
    }

    public Room findMostExpensiveRoom() {
        Room mostExpensiveRoom = null;
        for (Room r : roomlist) {
            if (mostExpensiveRoom == null || r.getBaseCost() > mostExpensiveRoom.getBaseCost()) {
                mostExpensiveRoom = r;
            }
        }
        return mostExpensiveRoom;
    }

    public void countRooms() {
        int countMT = 0;
        int countB = 0;
        for (Room r : roomlist) {
            if (r instanceof MeetingRoom) {
                countMT++;
            } else if (r instanceof BedRoom) {
                countB++;
            }
        }
        System.out.println("Meeting room: " + countMT);
        System.out.println("Bedroom: " + countB);
    }
}
