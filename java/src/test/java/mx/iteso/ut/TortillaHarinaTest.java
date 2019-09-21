package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setup(){
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void TestCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(15);
        assertEquals(15,tortillaHarina.getCurrentTemperature());
    }

    @Test
    public void TestTrueToasted(){
        tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }

    @Test
    public void TestFalseToasted(){
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }

    @Test
    public void TestToasting(){
        assertEquals(10, tortillaHarina.getToastTemperature());
    }
}

