import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Eilidh", 70, 5);
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
        assertEquals(5, customer.getMoney());
    }
}
