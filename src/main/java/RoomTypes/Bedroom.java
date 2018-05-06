package RoomTypes;


public class Bedroom extends Room{

    private BedType bedType;
    private int nightRate;

    public Bedroom(int room_number, int room_capacity, int room_rate, BedType bedType, int nightRate) {
        super(room_number, room_capacity, room_rate);
        this.bedType = bedType;
        this.nightRate = nightRate;
    }

    public RoomTypes.BedType getbedType() {
        return bedType;
    }

    public void setBedType(RoomTypes.BedType bedType) {
        bedType = bedType;
    }
    public int getValueFromEnum(){
        return this.bedType.getValue();
    }

}

