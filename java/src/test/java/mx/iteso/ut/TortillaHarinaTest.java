package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp(){
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(21);
        assertEquals(0, tortillaHarina.getCurrentTemperature());
    }
    @Test
    public void testFalseMelt(){
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }
    @Test
    public void testTrueMelt(){
        tortillaHarina.toast(true);
        assertFalse(tortillaHarina.isToasted());
    }
    @Test
    public void testMelting(){
        assertEquals(0, tortillaHarina.getToastTemperature());
    }

}
