import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Ruaridh");
    }

    @Test
    public void getName(){
        assertEquals("Ruaridh", guest1.getName());
    }


}
