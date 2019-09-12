package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TortillaMaizTest {

    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(21);
        assertEquals(0,tortillaMaiz.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testTrueToast(){
        tortillaMaiz.toast(true);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(0,tortillaMaiz.getToastTemperature());
    }

}
