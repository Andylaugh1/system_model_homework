import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Customer customer;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster(10, 130, "Leg-dangler", 8, 3, 4);
        customer = new Customer("Andy", 175, 50 );
    }

    @Test
    public void canGetCost(){
        assertEquals(10, rollercoaster.getCost());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(130, rollercoaster.getMinHeight());
    }

    @Test
    public void canGetType(){
        assertEquals("Leg-dangler", rollercoaster.getType());
    }

    @Test
    public void canGetRating(){
        assertEquals(8, rollercoaster.getRating());
    }

    @Test
    public void canGetNumberOfLoops(){
        assertEquals(4, rollercoaster.getNumberOfLoops());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, rollercoaster.getCapacity());
    }

    @Test
    public void canCountRiders(){
        assertEquals(0, rollercoaster.countRiders());
    }

    @Test
    public void canFindOutRiderAllowedToRide(){
        assertEquals(true, rollercoaster.isRiderAllowedToRide(customer));
    }

    @Test
    public void canFindOutRiderCanAffordToRide(){
        assertEquals(true, rollercoaster.canRiderAffordRide(customer));
    }

    @Test
    public void canCheckCustomerOntoRide(){
        rollercoaster.checkCustomerOntoRide(customer);
        assertEquals(1, rollercoaster.countRiders());
    }


    @Test
    public void canfinishRide(){
        rollercoaster.checkCustomerOntoRide(customer);
        rollercoaster.finishRide();
        assertEquals(0, rollercoaster.countRiders());
    }
}
