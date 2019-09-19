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
   Tortilla mockedTortilla2;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla = mock(Tortilla.class);
      mockedTortilla2 = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      quesadilla.setTortilla2(mockedTortilla2);


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
   public void quesadillaDoblePerfecta(){
	   when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Quesadilla perfecta", quesadilla.prepareDouble());
       verify(mockedTortilla, times(1)).toast(true);
       verify(mockedTortilla2, times(1)).toast(true);
       verify(mockedQueso, times(1)).melt(true);
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
   public void quesadillaDobleBuena(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla2.isToasted()).thenReturn(true);

       when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Quesadilla Buena", quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
       verify(mockedTortilla2, times(1)).toast(true);
       verify(mockedQueso, times(1)).melt(true);
   }
   
   @Test
   public void quesadillaDobleMala(){
	   when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Quesadilla Mala", quesadilla.prepareDouble());
       verify(mockedTortilla, times(1)).toast(true);
       verify(mockedTortilla2, times(1)).toast(true);
       verify(mockedQueso, never()).melt(true);
   }
   
   @Test
   public void quesadillaDobleTerrible(){
	   when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Quesadilla Terrible", quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
       verify(mockedTortilla2, times(1)).toast(true);
       verify(mockedQueso, never()).melt(true);
   }
   
   @Test
   public void quesadillaDobleRegular(){
	   when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla2.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Quesadilla Regular", quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
       verify(mockedTortilla2, never()).toast(true);
       verify(mockedQueso, times(1)).melt(true);
   }
   
   @Test
   public void noCocino(){
	   when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla2.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(25);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(25);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(11);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("No se cocinó", quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
       verify(mockedTortilla2, never()).toast(true);
       verify(mockedQueso, never()).melt(true);
   }
   @Test
   public void quesadillaTerrible(){
	      when(mockedQueso.isMelted()).thenReturn(false);
	       when(mockedTortilla.isToasted()).thenReturn(true);
	       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	       when(mockedTortilla.getToastTemperature()).thenReturn(10);
	       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
	       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
	       verify(mockedTortilla,times(1)).toast(true);
	       verify(mockedQueso,never()).melt(true);
   }
   @Test
   public void noHayGas(){
	   when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(22);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(11);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(false);
       verify(mockedQueso,never()).melt(false);
   }
}
