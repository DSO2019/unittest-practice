from mockito import when, mock, verify,assertEquals,times
from Quesadilla import *
from Queso import *
from Tortilla import *
import unittest
class QuesadillaTest(unittest.TestCase):
    def _init_(self):
        self.quesadilla = Quesadilla()
        self.mockedQueso = mock(Queso)  
        self.mockedTortilla = mock(Tortilla)
        self.mockedTortilla2 = mock(Tortilla)
        self.quesadilla.setQueso = self.mockedQueso
        self.quesadilla.setTortilla = self.mockedTortilla
        self.quesadilla.setTortilla2 = self.mockedTortilla2


    def quesadillaPerfecta(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Perfect quesadilla", self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)
    
    def quesadillaPerfectaDouble():
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Perfect quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedTortilla2, times = 1).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)

    def quesadillaBuena(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals("Good quesadilla", self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)

    def quesadillaBuenaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals("Good quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedTortilla2, times = 1).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)

    def quesadillaBuenaDouble2ndCase(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals("Good quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla2, times = 0).toast(True)
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)

    def quesadillaMalaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(20)
        assertEquals("Bad quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedTortilla2, times = 1).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)

    def quesadillaRegularDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals("Regular quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedTortilla2, times = 0).toast(True)
        verify(self.mockedQueso, times = 1).melt(True)

    def quesadillaTerrible(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(20)
        assertEquals("Terrible quesadilla", quesadilla.prepareSingle())
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)

    def quesadillaTerribleDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(20)
        assertEquals("Terrible quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times = 1).toast(True)
        verify(self.mockedTortilla2, times = 0).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)

    def quesadillaTerribleDouble2ndCase(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(20)
        assertEquals("Terrible quesadilla", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla2, times = 1).toast(True)
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)

    def noHayGas(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(0)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(0)
        assertEquals("You ran out of gas", quesadilla.prepareSingle())
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)

    def noHayGasDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(0)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(0)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(0)
        assertEquals("You ran out of gas", self.quesadilla.prepareDouble())
        verify(self.mockedTortilla2, times = 0).toast(True)
        verify(self.mockedTortilla, times = 0).toast(True)
        verify(self.mockedQueso, times = 0).melt(True)
