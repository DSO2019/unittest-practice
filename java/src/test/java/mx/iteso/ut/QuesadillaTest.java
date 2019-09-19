package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest
{
   Quesadilla quesadilla;
   Queso mockedQueso;
   Tortilla mockedTortilla;
   Tortilla mockedTortilla1;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla = mock(Tortilla.class);
      mockedTortilla1 = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      quesadilla.setTortilla1(mockedTortilla1);


   }
   @Test
   public void quesadillaPerfecta(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaBuena(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Good quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaTerrible(){
       //fail("Please implement corresponding test");
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,24);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,8);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedQueso,never()).melt(false);
   }
   @Test
   public void noHayGas()
   {
      //fail("Please implement corresponding test");
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,24,24,24,24);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,20,20,20,20);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla, never()).toast(false);
       verify(mockedQueso,never()).melt(false);
   }
   @Test
    public void quesadillaDoblePerfecta()
   {
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla1.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla1.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedTortilla1,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

    @Test
    public void quesadillaDobleBuenaTest()
    {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareDouble());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla1, never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void quesadillaDobleMalaTest()
    {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        assertEquals("Bad quesadilla",quesadilla.prepareDouble());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedQueso,never()).melt(true);
    }

    @Test
    public void quesadillaDobleTerribleTest()
    {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(20);
        assertEquals("Terrible quesadilla",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedTortilla1, times(1)).toast(true);
        verify(mockedQueso,never()).melt(true);
    }

    @Test
    public void quesadillaDobleSinGasTest()
    {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,15);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,15);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,15);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(false);
        verify(mockedTortilla1, never()).toast(false);
        verify(mockedQueso,never()).melt(false);
    }
}
