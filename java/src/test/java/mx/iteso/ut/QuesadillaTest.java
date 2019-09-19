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
   Tortilla mockedTortilla_1;
   Tortilla mockedTortilla_2;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla_1 = mock(Tortilla.class);
      mockedTortilla_2 = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla_1(mockedTortilla_1);
      quesadilla.setTortilla_2(mockedTortilla_2);

   }
   @Test
   public void quesadillaPerfecta(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla_1.isToasted()).thenReturn(true);
       when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_1.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla_1,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaBuena(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla_1.isToasted()).thenReturn(false);
       when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_1.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Good quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla_1,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaTerrible(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla_1.isToasted()).thenReturn(true);
       when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_1.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla_1,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
       //fail("Please implement corresponding test");
   }
   @Test
   public void noHayGas(){
    when(mockedQueso.isMelted()).thenReturn(false);
    when(mockedTortilla_1.isToasted()).thenReturn(false);
    when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_1.getToastTemperature()).thenReturn(20);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);
    assertEquals("You ran out of gas",quesadilla.prepareSingle());
    verify(mockedTortilla_1,never()).toast(true);
    verify(mockedQueso,times(1)).melt(true);
   }


   ////////////////////////////////////////////
   ////////////////////////////////////////////
   //////Desde aquí, son pruebas para quesadillas con dos tortillas
   @Test
   public void quesadillaPerfectaDoble(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla_1.isToasted()).thenReturn(true);
       when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_1.getToastTemperature()).thenReturn(10);
       when(mockedTortilla_2.isToasted()).thenReturn(true);
       when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla_1,times(1)).toast(true);
       verify(mockedTortilla_2,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaBuenaDoble(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla_1.isToasted()).thenReturn(true);
       when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_1.getToastTemperature()).thenReturn(20);
       when(mockedTortilla_2.isToasted()).thenReturn(false);
       when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla_2.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Good quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla_1,times(1)).toast(true);
       verify(mockedTortilla_2,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void quesadillaRegularDoble(){
    when(mockedQueso.isMelted()).thenReturn(true);
    when(mockedTortilla_1.isToasted()).thenReturn(false);
    when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_1.getToastTemperature()).thenReturn(10);
    when(mockedTortilla_2.isToasted()).thenReturn(false);
    when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_2.getToastTemperature()).thenReturn(10);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);
    assertEquals("Mala quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla_1,never()).toast(true);
    verify(mockedTortilla_2,never()).toast(true);
    verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaTerribleDoble(){
    when(mockedQueso.isMelted()).thenReturn(false);
    when(mockedTortilla_1.isToasted()).thenReturn(true);
    when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_1.getToastTemperature()).thenReturn(20);
    when(mockedTortilla_2.isToasted()).thenReturn(false);
    when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_2.getToastTemperature()).thenReturn(20);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);
    assertEquals("Terrible quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla_1,times(1)).toast(true);
    verify(mockedTortilla_2,never()).toast(true);
    verify(mockedQueso,never()).melt(true);
   }

   @Test
   public void quesadillaMalaDoble(){
    when(mockedQueso.isMelted()).thenReturn(false);
    when(mockedTortilla_1.isToasted()).thenReturn(true);
    when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_1.getToastTemperature()).thenReturn(10);
    when(mockedTortilla_2.isToasted()).thenReturn(true);
    when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_2.getToastTemperature()).thenReturn(10);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);
    assertEquals("Mala quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla_1,times(1)).toast(true);
    verify(mockedTortilla_2,times(1)).toast(true);
    verify(mockedQueso,never()).melt(true);
   }
   @Test
   public void noHayGasDoble(){
    when(mockedQueso.isMelted()).thenReturn(false);
    when(mockedTortilla_1.isToasted()).thenReturn(false);
    when(mockedTortilla_1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_1.getToastTemperature()).thenReturn(10);
    when(mockedTortilla_2.isToasted()).thenReturn(false);
    when(mockedTortilla_2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla_2.getToastTemperature()).thenReturn(10);
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);
    assertEquals("Mala quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla_1,never()).toast(true);
    verify(mockedTortilla_2,never()).toast(true);
    verify(mockedQueso,never()).melt(true);
   }
}
