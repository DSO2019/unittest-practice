package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;


public class QuesadillaDobleTest {
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;
    Tortilla mockedTortilla2;


    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedQueso = mock(Queso.class);
        mockedTortilla = mock(Tortilla.class);
        mockedTortilla2 = mock(Tortilla.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla1(mockedTortilla);
        quesadilla.setTortilla2(mockedTortilla2);

    }
    @Test
    public void quesadillaPerfecta() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla", quesadilla.prepareDouble());
        verify(mockedTortilla, times(1)).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaTest1() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedTortilla2, never()).toast(false);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaBuenaTest2() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(false);
        verify(mockedTortilla2, never()).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }

    @Test
    public void quesadillaMalaTest() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla mala", quesadilla.prepareDouble());
        verify(mockedTortilla, times(1)).toast(true);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQueso, never()).melt(false);
    }


    @Test
    public void quesadillaTerribleTest1() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla terrible", quesadilla.prepareDouble());
        verify(mockedTortilla, times(1)).toast(true);
        verify(mockedTortilla2, never()).toast(false);
        verify(mockedQueso, never()).melt(false);
    }

    @Test
    public void quesadillaTerribleTest2() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.isToasted()).thenReturn(true);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Quesadilla terrible", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(false);
        verify(mockedTortilla2, times(1)).toast(true);
        verify(mockedQueso, never()).melt(false);
    }

    @Test
    public void noSeCocino() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla2.isToasted()).thenReturn(false);
        when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedTortilla2.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("No se cocino", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(false);
        verify(mockedTortilla2, never()).toast(false);
        verify(mockedQueso, never()).melt(false);
    }
}
