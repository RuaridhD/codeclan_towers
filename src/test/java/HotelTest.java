import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel();
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void conferenceStartsEmpty(){
        assertEquals(0, hotel.conferenceCount());
    }


}
