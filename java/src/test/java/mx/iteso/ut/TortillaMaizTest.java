package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setup(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void TestCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(20);
        assertEquals(20,tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void TestTrueToasted(){
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }

    @Test
    public void TestFalseToasted(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }

    @Test
    public void TestToasting(){

        assertEquals(10, tortillaMaiz.getToastTemperature());
    }
}
