package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QuesoManchegoTest {
    QuesoManchego quesoManchego;

    @Before
    public void setup(){
        quesoManchego = new QuesoManchego();
    }

    @Test
    public void testTrueMelt(){
        quesoManchego.melt(true);
        assertTrue(quesoManchego.isMelted());
    }

    @Test
    public void testFalseMelt(){
        quesoManchego.melt(false);
        assertFalse(quesoManchego.isMelted());
    }

    @Test
    public void testCurrentTemperature(){
        quesoManchego.setCurrentTemperature(21);
        assertEquals(21, quesoManchego.getCurrentTemperature());
    }

    @Test
    public void testMelting(){
        assertEquals(21, quesoManchego.getMeltingTemperature());
    }
}
