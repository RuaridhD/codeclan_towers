import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private ConferenceRoom conference;

    @Before
    public void before() {
        ArrayList<String> roomList = new ArrayList<>();
        roomList.add("Classroom");
        roomList.add("Boardroom");
        roomList.add("Theater");
        conference = new ConferenceRoom(150, roomList);
    }

    @Test
    public void testRoomCount() {
        assertEquals(3, conference.roomCount());
    }

}

