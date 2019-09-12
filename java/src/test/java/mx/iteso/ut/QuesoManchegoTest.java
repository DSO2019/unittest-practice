package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuesoManchegoTest {
    QuesoManchego quesoManchego;

    @Before
    public void setUp(){
        quesoManchego = new QuesoManchego();
    }

    @Test
    public void testCurrentTemperature(){
        quesoManchego.setCurrentTemperature(21);
        assertEquals(0, quesoManchego.getCurrentTemperature());
    }
    @Test
    public void testFalseMelt(){
        quesoManchego.melt(false);
        assertFalse(quesoManchego.isMelted());
    }
    @Test
    public void testTrueMelt(){
        quesoManchego.melt(true);
        assertFalse(quesoManchego.isMelted());
    }
    @Test
    public void testMelting(){
        assertEquals(0, quesoManchego.getMeltingTemperature());
    }

}
