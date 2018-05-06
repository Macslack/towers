package RoomTypes;

public enum BedType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    QUADRUPLE(4);

    private final int value;

    BedType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
