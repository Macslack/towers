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
    public void addGuestToRoom(Room room) {


    }
    public void addRoomtoHotel(Room room) {
         this.rooms.add(room);
    }
    public void removeRoomFromHotel(Room room){
        this.rooms.remove(room);
    }
}
