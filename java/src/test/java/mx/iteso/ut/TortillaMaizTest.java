package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TortillaMaizTest {

TortillaMaiz tortillaMaiz;
	
    @Before
    public void setUp(){
        tortillaMaiz= new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
    	tortillaMaiz.setCurrentTemperature(15);
        assertEquals(15,tortillaMaiz.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
    	tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testTrueToast(){
    	tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(35,tortillaMaiz.getToastTemperature());
    }

}
