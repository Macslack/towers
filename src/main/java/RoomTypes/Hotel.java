package RoomTypes;

import RoomTypes.Room;

import java.util.ArrayList;

public class Hotel {


    private String name;
    private ArrayList<Room> rooms;


    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void removeGuestFromRoom(Room room){


    }
}
