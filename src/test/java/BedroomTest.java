import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.DOUBLE);
    }

    @Test
    public void canGetBedroom(){
        assertEquals(BedroomType.DOUBLE, bedroom.getBedroom());
    }
}
