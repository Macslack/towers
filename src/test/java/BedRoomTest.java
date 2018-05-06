import RoomTypes.BedType;
import RoomTypes.Bedroom;
import RoomTypes.Guest;
import org.junit.Before;

public class BedRoomTest {
    Guest guest;
    Bedroom bedroom;

    @Before
    public void before() {
        guest = new Guest("Callum");
        bedroom = new Bedroom(1, 2, 3, BedType.SINGLE, 2);
    }
}
