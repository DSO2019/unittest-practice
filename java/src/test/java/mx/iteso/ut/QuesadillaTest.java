package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest {
    Quesadilla quesadilla;
    Quesadilla quesadillaDoble;
    Queso mockedQueso;
    Queso mockedQuesoDoble;
    Tortilla mockedTortilla;
    Tortilla mockedTortilla1;
    Tortilla mockedTortilla2;

    @Before
    public void setUp() {
        quesadilla = new Quesadilla();
        quesadillaDoble = new Quesadilla();
        mockedQueso = mock(Queso.class);
        mockedQuesoDoble = mock(Queso.class);
        mockedTortilla = mock(Tortilla.class);
        mockedTortilla1 = mock(Tortilla.class);
        mockedTortilla2 = mock(Tortilla.class);
        // Para la simple
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
        // Para la doble
        quesadillaDoble.setQueso(mockedQuesoDoble);
        quesadillaDoble.setTortillas(mockedTortilla1,mockedTortilla2);
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
        // Implementing expected values that makes a terrible quesadilla
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
        // Implementing expected values when there's no gas
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

/*************************** COMIENZA QUESADILLA DOBLE ***********************************/

    @Test
    public void quesadillaDoblePerfecta() {
        when(mockedQuesoDoble.isMelted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect double quesadilla", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleBuenaTortilla1(){
        when(mockedQuesoDoble.isMelted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good double quesadilla toasted2", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, never()).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleBuenaTortilla2(){
        when(mockedQuesoDoble.isMelted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good double quesadilla toasted1", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleRegular() {
        when(mockedQuesoDoble.isMelted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Regular double quesadilla", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, never()).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleMala() {
        when(mockedQuesoDoble.isMelted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Bad double quesadilla", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleTerrible1() {
        when(mockedQuesoDoble.isMelted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible double quesadilla toasted2", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, never()).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleTerrible2() {
        when(mockedQuesoDoble.isMelted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible double quesadilla toasted1", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleNoSeCocino() {
        when(mockedQuesoDoble.isMelted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQuesoDoble.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQuesoDoble.getMeltingTemperature()).thenReturn(10);
        assertEquals("Not cooked double quesadilla", quesadillaDoble.prepareDouble());
        verify(mockedTortilla1, never()).toast(true);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQuesoDoble, times(1)).melt(true);
    }
}
