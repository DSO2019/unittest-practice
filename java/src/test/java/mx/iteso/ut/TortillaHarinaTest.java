package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TortillaHarinaTest {
	TortillaHarina tortillaHarina;
	
    @Before
    public void setUp(){
        tortillaHarina= new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
    	tortillaHarina.setCurrentTemperature(15);
        assertEquals(15,tortillaHarina.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
    	tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }
    @Test
    public void testTrueToast(){
    	tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(40,tortillaHarina.getToastTemperature());
    }

}
