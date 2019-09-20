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
   Tortilla mockedTortillaDos;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      
      mockedTortillaDos = mock(Tortilla.class);
      quesadilla.setTortillaDos(mockedTortillaDos);


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
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void noHayGas(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void quesadillaPerfecta_double(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortillaDos.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedTortillaDos,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

    @Test
   public void quesadillaBuena_double(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortillaDos.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Good quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedTortillaDos,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

    @Test
   public void quesadillaBad_double(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortillaDos.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Bad quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedTortillaDos,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
   }

     @Test
   public void quesadillaTerrible_double(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortillaDos.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Terrible quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedTortillaDos,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
   }

    @Test
   public void noHaygas_double(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortillaDos.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("You ran out of gas",quesadilla.prepareDouble());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedTortillaDos,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
   }

    @Test
   public void regular_double(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortillaDos.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortillaDos.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaDos.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Regular quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedTortillaDos,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
}
