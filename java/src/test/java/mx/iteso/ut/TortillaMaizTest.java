package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(17);
        assertEquals(17,tortillaMaiz.getCurrentTemperature());
    }
    @Test
    public void testFalsetoast(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testTruetoast(){
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }
    @Test
    public void testtoasting(){
        assertEquals(15,tortillaMaiz.getToastTemperature());
    }

}
