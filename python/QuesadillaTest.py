from Quesadilla import Quesadilla
from QuesoInterface import Queso
from TortillaInterface import Tortilla
from mockito import when, mock, unstub, verify
import unittest


class QuesadillaTest(unittest.TestCase):
    def __init__(self):
        mockedTortilla = mock(Tortilla, strict=False)
        mockedTortilla2 = mock(Tortilla, strict=False)
        mockedQueso = mock(Queso, strict=False)
        quesadilla = Quesadilla()
        quesadilla.setQueso(self.mockedQueso)
        quesadilla.setTortilla(self.mockedTortilla)
        quesadilla.setTortilla(self.mockedTortilla2)

    def testPerfectQuesadilla(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Perfect quesadilla', self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times=1).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def testQuesadillaBuena(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Perfect quesadilla', self.quesadilla.prepareSingle())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

    def testTerribleQuesadilla(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Perfect quesadilla', self.quesadilla.prepareSingle())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

    def testOutOfGas(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Perfect quesadilla', self.quesadilla.prepareSingle())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

# /////////////////////////////////////////////////////////
# 			DOUBLE QUESADILLA TESTS
# /////////////////////////////////////////////////////////

    def testPerfectQuesadillaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Perfect quesadilla', self.quesadilla.prepareDouble())
        verify(self.mockedTortilla, times=1).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def testQuesadillaBuenaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        (2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Good quesadilla', self.quesadilla.prepareDouble())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

    def testTerribleQuesadillaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Terrible quesadilla', self.quesadilla.prepareDouble())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

    def testOutOfGasDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('You ran out of gas', self.quesadilla.prepareDouble())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)

    def testQuesadillaMalaDouble(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().
        thenReturn(2, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        assertEquals('Bad quesadilla', self.quesadilla.prepareDouble())
        verify(self.mockedQueso, times=1).melt(True)
        verify(self.mockedTortilla, times=1).toast(True)
