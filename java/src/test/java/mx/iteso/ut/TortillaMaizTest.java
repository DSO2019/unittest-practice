package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp() {
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature() {
        tortillaMaiz.setCurrentTemperature(10);
        assertEquals(10, tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void testFalseToast() {
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }

    @Test
    public void testTrueToast() {
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }

    @Test
    public void testToasting() {
        assertEquals(10, tortillaMaiz.getToastTemperature());
    }

}
