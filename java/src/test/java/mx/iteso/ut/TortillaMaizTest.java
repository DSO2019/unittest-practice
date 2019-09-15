package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class TortillaMaizTest {

    TortillaMaiz tortillaMaiz;

    @Before
    public void setup(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testTrueToasted(){
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }

    @Test
    public void testFalseToasted(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(19);
        assertEquals(19, tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void testToastTemperature(){
        assertEquals(40, tortillaMaiz.getToastTemperature());
    }

}
