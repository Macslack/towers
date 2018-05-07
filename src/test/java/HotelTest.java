import RoomTypes.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HotelTest {

        Hotel hotel;
        Guest guest;
        Bedroom bedroom;

        @Before
        public void before(){
            hotel = new Hotel("Triple Tree");
            guest = new Guest("Callum");
            bedroom = new Bedroom(1, 2, 3, BedType.SINGLE, 10);


        }
        @Test
    public void canAddGuestToRoom(){

        }
        @Test
    public void canRemoveGuestFromRoom(){

        }
        @Test
    public void canAddRoomtoHotel(){

        }
        @Test
    public void canRemoveRoomFromHotel(){

        }
}
