import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Teacups teacups;

    @Before
    public void before(){
        customer = new Customer("Eilidh", 70, 10);
        teacups = new Teacups(4, 60, "Kiddie", 2, 12);
    }

    @Test
    public void canGetName(){
        assertEquals("Eilidh", customer.getName());
    }

    @Test
    public void canGetHeight() {
        assertEquals(70, customer.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(10, customer.getMoney());
    }

//    @Test
//    public void canPayForRide(){
//        customer.payForRide(teacups);
//        assertEquals(6, customer.getMoney());
//    }
}
