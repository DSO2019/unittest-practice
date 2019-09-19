package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class QuesadillaTest {
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;
    Tortilla[] mockedTortillas;

    @Before
    public void setUp() {
        quesadilla = new Quesadilla();
        mockedQueso = mock(Queso.class);
        mockedTortilla = mock(Tortilla.class);
        mockedTortillas = new Tortilla[2];
        mockedTortillas[0] = mock(Tortilla.class);
        mockedTortillas[1] = mock(Tortilla.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
        quesadilla.setTortillas(mockedTortillas);
    }

    @Test
    public void quesadillaPerfecta() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaBuena() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaTerrible() {
        // fail("Please implement corresponding test");
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla", quesadilla.prepareSingle());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void noHayGas() {
        // fail("Please implement corresponding test");
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas", quesadilla.prepareSingle());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDoblePerfecta() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortillas[0].isToasted()).thenReturn(true);
        when(mockedTortillas[1].isToasted()).thenReturn(true);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla perfecta", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleBuena() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortillas[0].isToasted()).thenReturn(true);
        when(mockedTortillas[1].isToasted()).thenReturn(false);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla buena", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleMala() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortillas[0].isToasted()).thenReturn(true);
        when(mockedTortillas[1].isToasted()).thenReturn(true);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla mala", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleTerrible() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortillas[0].isToasted()).thenReturn(false);
        when(mockedTortillas[1].isToasted()).thenReturn(true);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla terrible", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleNoSeCocino() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortillas[0].isToasted()).thenReturn(false);
        when(mockedTortillas[1].isToasted()).thenReturn(false);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("No se cocinó", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleRegular() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortillas[0].isToasted()).thenReturn(false);
        when(mockedTortillas[1].isToasted()).thenReturn(false);
        when(mockedTortillas[0].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[0].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortillas[1].getToastTemperature()).thenReturn(10);
        when(mockedTortillas[1].getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla regular", quesadilla.prepareDouble());
        verify(mockedTortillas[0], times(1)).toast(true);
        verify(mockedTortillas[1], times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

}
