package RoomTypes;

public class ConferenceRoom extends Room {
    private String name;

    public ConferenceRoom(int room_number, int room_capacity, int room_rate, String name) {
        super(room_number, room_capacity, room_rate);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
