import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacupTest {

    Teacups teacups;

    @Before
    public void before(){
        teacups = new Teacups(4, 60, "Kiddie", 2, 12);
    }

    @Test
    public void canGetCost(){
        assertEquals(4, teacups.getCost());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(60, teacups.getMinHeight());
    }

    @Test
    public void canGetType(){
        assertEquals("Kiddie", teacups.getType());
    }

    @Test
    public void canGetRating(){
        assertEquals(2, teacups.getRating());
    }
}
