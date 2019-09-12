package mx.iteso.ut;



import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp(){
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(21);
        assertEquals(21,tortillaHarina.getCurrentTemperature());
    }
    @Test
    public void testFalseToasted(){
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }
    @Test
    public void testTrueMelt(){
        tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }
    @Test
    public void testMelting(){
        assertEquals(20,tortillaHarina.getToastTemperature());
    }

}

