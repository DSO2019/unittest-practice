package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class QuesoManchegoTest {
	  QuesoManchego quesoManchego;

	    @Before
	    public void setUp(){
	        quesoManchego= new QuesoManchego();
	    }

	    @Test
	    public void testCurrentTemperature(){
	    	quesoManchego.setCurrentTemperature(26);
	        assertEquals(26,quesoManchego.getCurrentTemperature());
	    }
	    @Test
	    public void testFalseMelt(){
	    	quesoManchego.melt(false);
	        assertFalse(quesoManchego.isMelted());
	    }
	    @Test
	    public void testTrueMelt(){
	    	quesoManchego.melt(true);
	        assertTrue(quesoManchego.isMelted());
	    }
	    @Test
	    public void testMelting(){
	        assertEquals(25,quesoManchego.getMeltingTemperature());
	    }
}
