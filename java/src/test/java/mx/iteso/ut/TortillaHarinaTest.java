package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp() {
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature() {
        tortillaHarina.setCurrentTemperature(17);
        assertEquals(17, tortillaHarina.getCurrentTemperature());
    }

    @Test
    public void testFalsetoast() {
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }

    @Test
    public void testTruetoast() {
        tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }

    @Test
    public void testtoasting() {
        assertEquals(10, tortillaHarina.getToastTemperature());
    }

}
