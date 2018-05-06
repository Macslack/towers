package RoomTypes;

import java.util.ArrayList;

public abstract class Room {
    Room room;

    private int room_number;
    private int room_capacity;
    private int room_rate;
    private ArrayList<Guest> guests;

    public Room(int room_number, int room_capacity, int room_rate){
        this.room_number = room_number;
        this.room_capacity = room_capacity;
        this.room_rate = room_rate;
        this.guests = new ArrayList<>();
    }

    public int getRoom_number() {
        return room_number;
    }

    public int getRoom_capacity() {
        return room_capacity;
    }

    public int getRoom_rate() {
        return room_rate;
    }

    public void setRoom_rate(int room_rate) {
        this.room_rate = room_rate;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
    public void addGuest(Guest guest) {
        if (totalGuests() < room_capacity)
            this.guests.add(guest);
    }
    public int totalGuests() {
        return this.guests.size();
    }
    public Guest removeGuest() {
        return this.guests.get(0);
    }
    public void clearGuests() {
        this.guests.clear();
    }

}
