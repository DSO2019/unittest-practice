from ...main.python import Quesadilla,QuesoManchego,TortillaHarina
from mockito import when, mock, verify,assertEquals,never,times
import unittest
class QuesadillaTest(unittest.TestCase):
    def _init_(self):
        self.quesadilla = Quesadilla()
        self.mockedQueso = mock(QuesoManchego)  
        self.mockedTortilla = mock(TortillaHarina)
        self.quesadilla.setQueso = self.mockedQueso
        self.quesadilla.setTortilla = self.mockedTortilla


    def quesadillaPerfecta(self):
        when(self.mockedQueso.isMelted()).thenReturn(True)
        when(self.mockedQueso.isToasted()).thenReturn(True)
        when(self.mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla.getToastTemperature()).thenReturn(10)
        when(self.mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso.getMeltingTemperature()).thenReturn(10)
        assertEquals("Perfect quesadilla", quesadilla.prepareSingle())
        verify(self.mockedTortilla, times(1)).toast(True)
        verify(self.mockedQueso, times(1)).melt(True)
    
    def quesadillaBuena(self):
        when(self.mockedQueso.isMelted()).thenReturn(True)
        when(self.mockedQueso.isToasted()).thenReturn(False)
        when(self.mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla.getToastTemperature()).thenReturn(20)
        when(self.mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso.getMeltingTemperature()).thenReturn(10)
        assertEquals("Good quesadilla", quesadilla.prepareSingle())
        verify(self.mockedTortilla, never()).toast(True)
        verify(self.mockedQueso, times(1)).melt(True)

    def quesadillaTerrible(self):
        when(self.mockedQueso.isMelted()).thenReturn(False)
        when(self.mockedQueso.isToasted()).thenReturn(True)
        when(self.mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla.getToastTemperature()).thenReturn(10)
        when(self.mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso.getMeltingTemperature()).thenReturn(10)
        assertEquals("Terrible quesadilla", quesadilla.prepareSingle())
        verify(self.mockedTortilla, never()).toast(True)
        verify(self.mockedQueso, times(1)).melt(True)

    def noHayGas(self):
        when(self.mockedQueso.isMelted()).thenReturn(False)
        when(self.mockedQueso.isToasted()).thenReturn(False)
        when(self.mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla.getToastTemperature()).thenReturn(0)
        when(self.mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso.getMeltingTemperature()).thenReturn(0)
        assertEquals("You ran out of gas", quesadilla.prepareSingle())
        verify(self.mockedTortilla, never()).toast(True)
        verify(self.mockedQueso, times(1)).melt(True)