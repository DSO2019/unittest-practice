package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(21);
        assertEquals(0, tortillaMaiz.getCurrentTemperature());
    }
    @Test
    public void testFalseMelt(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testTrueMelt(){
        tortillaMaiz.toast(true);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testMelting(){
        assertEquals(0, tortillaMaiz.getToastTemperature());
    }

}
