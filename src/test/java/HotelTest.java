import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private ConferenceRoom conference;
    private Bedroom bedroom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Ruaridh");
        conference = new ConferenceRoom(150, "Classroom");
        bedroom = new Bedroom(100, BedroomType.DOUBLE);
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void conferenceStartsEmpty(){
        assertEquals(0, hotel.conferenceCount());
    }

    @Test
    public void getConferenceValue(){
        assertEquals(150, conference.getRate());
    }

    @Test
    public void getBedroomRate(){
        assertEquals(100, bedroom.getRate());
    }

    @Test
    public void getConferenceName(){
        assertEquals("Classroom", conference.getRoomType());
    }

    @Test
    public void getBedroomName(){
        assertEquals(bedroom.getBedroom(), BedroomType.DOUBLE);
    }

    @Test
    public void canCheckInBedroom(){
        hotel.checkInBedroom(guest);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canCheckInConferenceRoom(){
        hotel.checkInConferenceRoom(guest);
        assertEquals(1, hotel.conferenceCount());
    }

    @Test
    public void canListGuestsInBedroom(){
        hotel.checkInBedroom(guest);
        assertEquals("Ruaridh", hotel.getGuests());
    }


}
